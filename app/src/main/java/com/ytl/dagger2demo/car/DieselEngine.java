package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class DieselEngine implements Engine{

    private static final String TAG = "Car";

    private int hoursePower;

    @Inject
    public DieselEngine(int hoursePower){
        this.hoursePower = hoursePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + hoursePower);

    }
}
