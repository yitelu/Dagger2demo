package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class Remote {

    private static final String TAG = "Car";

    @Inject
    public Remote() {
    }

    public void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }
}
