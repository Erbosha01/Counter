package com.geektech.counter;

import com.geektech.counter.presenter.CounterPresenter;
import com.geektech.counter.view.CounterContacts;

public class Injector {
    public static CounterPresenter getPresenter() {
        return new CounterPresenter();
    }
}
