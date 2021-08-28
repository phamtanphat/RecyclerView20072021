package com.example.recyclerview20072021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder>{

    List<Food> listFood;
    OnItemListener onItemListener;

    FoodAdapter(List<Food> listFood){
        this.listFood = listFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Khai báo lớp đối tượng để convert kiểu int sang kiểu view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food,parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.onBindView(listFood.get(position));
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tvName,tvPrice;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textViewName);
            tvPrice = itemView.findViewById(R.id.textViewPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemListener != null){
                        onItemListener.onItemClick(getAdapterPosition());
                    }
                }
            });
        }

        public void onBindView(Food food){
            img.setImageResource(food.getImage());
            tvName.setText(food.getName());
            NumberFormat formatter = new DecimalFormat("#,###");
            tvPrice.setText("Giá " + formatter.format(food.getPrice()));
        }
    }

    public void setOnItemListener(OnItemListener onItemListener){
        this.onItemListener = onItemListener;
    }
}
