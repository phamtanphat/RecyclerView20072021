package com.example.recyclerview20072021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvFood;
    List<Food> mListFood;
    FoodAdapter mFoodAdapter;
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
    }
}