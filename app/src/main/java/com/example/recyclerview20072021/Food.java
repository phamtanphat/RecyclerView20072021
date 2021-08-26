package com.example.recyclerview20072021;

import java.util.Arrays;
import java.util.List;

public class Food {
    private int image;
    private String name;
    private long price;

    public Food(int image, String name, long price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static List<Food> getMock(){
        return Arrays.asList(
                new Food(R.drawable.hinh_bun_bo,"Bún bò",40000),
                new Food(R.drawable.hinh_bun_dau,"Bún đậu mắm tôm",50000),
                new Food(R.drawable.hinh_com_suon,"Cơm sườn",60000),
                new Food(R.drawable.hinh_hu_tieu,"Hủ tiếu nam vang",30000),
                new Food(R.drawable.hinh_tra_sua,"Trà sữa",25000),
                new Food(R.drawable.hinh_bun_bo,"Bún bò",40000),
                new Food(R.drawable.hinh_bun_dau,"Bún đậu mắm tôm",50000),
                new Food(R.drawable.hinh_com_suon,"Cơm sườn",60000),
                new Food(R.drawable.hinh_hu_tieu,"Hủ tiếu nam vang",30000),
                new Food(R.drawable.hinh_tra_sua,"Trà sữa",25000),
                new Food(R.drawable.hinh_bun_bo,"Bún bò",40000),
                new Food(R.drawable.hinh_bun_dau,"Bún đậu mắm tôm",50000),
                new Food(R.drawable.hinh_com_suon,"Cơm sườn",60000),
                new Food(R.drawable.hinh_hu_tieu,"Hủ tiếu nam vang",30000),
                new Food(R.drawable.hinh_tra_sua,"Trà sữa",25000),
                new Food(R.drawable.hinh_bun_bo,"Bún bò",40000),
                new Food(R.drawable.hinh_bun_dau,"Bún đậu mắm tôm",50000),
                new Food(R.drawable.hinh_com_suon,"Cơm sườn",60000),
                new Food(R.drawable.hinh_hu_tieu,"Hủ tiếu nam vang",30000),
                new Food(R.drawable.hinh_tra_sua,"Trà sữa",25000)
        );
    }
}
