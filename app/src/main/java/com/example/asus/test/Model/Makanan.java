package com.example.asus.test.Model;

/**
 * Created by ASUS on 04/10/2019.
 */

public class Makanan {

    private String title;
    private float price;

    public Makanan(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
