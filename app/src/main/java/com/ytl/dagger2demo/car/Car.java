package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class Car {

    private static final String TAG = "Car";

    //@Inject Engine engine;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.d(TAG, "driving... ");
    }
}
