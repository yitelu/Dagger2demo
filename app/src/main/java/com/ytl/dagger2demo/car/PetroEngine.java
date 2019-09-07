package com.ytl.dagger2demo.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class PetroEngine implements Engine{

    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetroEngine(@Named("horse power")int horsePower,
                       @Named("engine capacity")int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. " +
                "\nHorsepower: "      + horsePower +
                "\nEngine Capacity: " + engineCapacity);

    }
}
