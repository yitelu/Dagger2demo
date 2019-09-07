package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Richard Yi-Te Lu on 06,September,2019
 */

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    //Driver getDriver();

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{

        AppComponent create(DriverModule driverModule);
    }




}
