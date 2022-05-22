package com.geektech.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.geektech.counter.databinding.ActivityMainBinding;
import com.geektech.counter.presenter.CounterPresenter;
import com.geektech.counter.view.CounterContacts;

public class MainActivity extends AppCompatActivity implements CounterContacts.CounterView{
    private ActivityMainBinding binding;
    CounterContacts.CounterPresenter counterPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        counterPresenter = Injector.getPresenter();
        counterPresenter.attachCounterView(this);
        initClickListener();
    }

    private void initClickListener() {
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterPresenter.increment();
            }
        });
        binding.btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterPresenter.decrement();
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.textCounter.setText(String.valueOf(count));
    }

    @Override
    public void makeToast() {
        Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void changeColor() {
        binding.textCounter.setTextColor(Color.GREEN);
    }

    @Override
    public void returnColor() {
        binding.textCounter.setTextColor(Color.BLACK);
    }


}