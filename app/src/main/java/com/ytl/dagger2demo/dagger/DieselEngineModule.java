package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.car.DieselEngine;
import com.ytl.dagger2demo.car.Engine;
import com.ytl.dagger2demo.car.PetroEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        //return new DieselEngine(horsePower);
        return engine;
    }

//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);

}
