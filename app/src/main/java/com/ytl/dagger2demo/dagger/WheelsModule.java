package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.car.Rims;
import com.ytl.dagger2demo.car.Tires;
import com.ytl.dagger2demo.car.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }



}
