package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.car.Engine;
import com.ytl.dagger2demo.car.PetroEngine;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
@Module
public abstract class PetrolEngineModule {

//    @Provides
//    Engine provideEngine(PetroEngine engine){
//        return engine;
//    }

    @Binds
    abstract Engine bindEngine(PetroEngine engine);

}
