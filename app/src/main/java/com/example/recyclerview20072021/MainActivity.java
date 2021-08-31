package com.example.recyclerview20072021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    List<Food> mListFood;
    FoodAdapter mFoodAdapter;
    int mCurrentPage = 1;
    int mTotalPage = 10;
    boolean mLoading = false;
    boolean mLastPage = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvFood = findViewById(R.id.recyclerView);
        mListFood = Food.getMock();
        mFoodAdapter = new FoodAdapter(mListFood);

        mRcvFood.setLayoutManager(new LinearLayoutManager(this));
        mRcvFood.setHasFixedSize(true);
        mRcvFood.setAdapter(mFoodAdapter);


        mFoodAdapter.setOnItemListener(new OnItemListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(
                        MainActivity.this,
                        "Xóa món " + mListFood.get(position).getName(),
                        Toast.LENGTH_SHORT)
                     .show();
                mListFood.remove(mListFood.get(position));
                mFoodAdapter.notifyItemRemoved(position);
//                mFoodAdapter.notifyItemRangeRemoved(position, mListFood.size());

            }
        });

        mRcvFood.addOnScrollListener(new PaginationScrollListener((LinearLayoutManager) mRcvFood.getLayoutManager()) {
            @Override
            public void loadMoreItem() {
                mLoading = true;
                mCurrentPage +=1;

                loadNextPage();
            }

            @Override
            public boolean isLoading() {
                return mLoading;
            }

            @Override
            public boolean isLastPage() {
                return mLastPage;
            }
        });
    }

    private void loadNextPage(){
        new CountDownTimer(2000 , 2000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Log.d("BBB",mCurrentPage + "");
                if (mCurrentPage > 2){
                    mFoodAdapter.removeLoading();
                }
                mListFood.addAll(Food.getMock());
                mFoodAdapter.notifyDataSetChanged();
                mLoading = false;

                if (mCurrentPage < mTotalPage){
                    mFoodAdapter.addFooterLoading();
                }else{
                    mLastPage = true;
                }

            }
        }.start();
    }
}