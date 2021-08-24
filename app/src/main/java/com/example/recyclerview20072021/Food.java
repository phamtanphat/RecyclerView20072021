package com.example.recyclerview20072021;

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
}
