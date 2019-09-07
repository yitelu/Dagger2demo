package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Richard Yi-Te Lu on 06,September,2019
 */

@Module
public class DriverModule {

    private String driverName;

    public DriverModule(String driverName){
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver provideDriver(){
        return new Driver(driverName);
    }
}
