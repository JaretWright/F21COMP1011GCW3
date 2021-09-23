package com.example.f21comp1011gcw3;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class PriceChangeListener implements ChangeListener {
    @Override
    public void changed(ObservableValue observableValue, Object oldValue, Object newValue) {
        System.out.printf("old value: %.2f      new Value: %.2f%n",oldValue, newValue);
    }
}
