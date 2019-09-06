package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class Tires {
    private static final String TAG = "Car";

    //assume that don't own the class and can't annotate the constructor

//    @Inject
//    public Tires() {
//    }

    public void inflate(){
        Log.d(TAG, "Tire inflated");
    }

}
