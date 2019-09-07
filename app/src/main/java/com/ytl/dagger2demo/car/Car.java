package com.ytl.dagger2demo.car;

import android.util.Log;

import com.ytl.dagger2demo.dagger.PerActivity;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */

@PerActivity
public class Car {

    private static final String TAG = "Car";


    //@Inject Engine engine;
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }


    public void drive(){
        engine.start();
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }
}
