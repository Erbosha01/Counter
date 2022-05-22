package com.geektech.counter.view;

public class CounterContacts {
    public interface CounterView {
        void updateText(int count);
        void makeToast();
        void changeColor();
        void returnColor();
    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachCounterView(CounterView counterView);
    }
}
