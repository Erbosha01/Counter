package com.geektech.counter.presenter;

import android.widget.Toast;

import com.geektech.counter.MainActivity;
import com.geektech.counter.model.CounterModel;
import com.geektech.counter.view.CounterContacts;

public class CounterPresenter implements CounterContacts.CounterPresenter {
    CounterModel model = new CounterModel();
    CounterContacts.CounterView counterView;

    @Override
    public void increment() {
        model.increment();
        counterView.updateText(model.getCount());

        if (model.getCount() == model.getToast()) {
            counterView.makeToast();
        }

        if (model.getCount() == model.getColor()) {
            counterView.changeColor();
        } else {
            counterView.returnColor();
        }
    }

    @Override
    public void decrement() {
        model.decrement();
        counterView.updateText(model.getCount());

        if (model.getCount() == model.getToast()) {
            counterView.makeToast();
        }

        if (model.getCount() == model.getColor()) {
            counterView.changeColor();
        } else {
            counterView.returnColor();
        }
    }

    @Override
    public void attachCounterView(CounterContacts.CounterView counterView) {
        this.counterView = counterView;
    }
}
