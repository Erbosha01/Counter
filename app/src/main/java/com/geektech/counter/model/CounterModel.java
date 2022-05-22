package com.geektech.counter.model;

import android.widget.Toast;

public class CounterModel {
    public int count = 0;
    public int toast = 10;
    public int color = 15;

    public void increment() {
        count++;
    }
    public void decrement() {
        count--;
    }

    public int getToast() {
        return toast;
    }

    public int getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }
}
