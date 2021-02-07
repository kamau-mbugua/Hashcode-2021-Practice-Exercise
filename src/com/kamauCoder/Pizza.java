package com.kamauCoder;

import java.util.Arrays;

public class Pizza {
    public int count;
    public  String[] ingredients;

    public Pizza(int count, String[] ingredients) {
        this.count = count;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "count=" + count +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }
}
