package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class PetroEngine implements Engine{

    private static final String TAG = "Car";

    @Inject
    public PetroEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");

    }
}
