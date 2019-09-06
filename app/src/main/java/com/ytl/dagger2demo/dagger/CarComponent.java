package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.MainActivity;
import com.ytl.dagger2demo.car.Car;

import dagger.Component;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
