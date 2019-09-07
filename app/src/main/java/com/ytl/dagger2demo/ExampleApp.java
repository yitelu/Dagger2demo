package com.ytl.dagger2demo;

import android.app.Application;

import com.ytl.dagger2demo.dagger.ActivityComponent;
import com.ytl.dagger2demo.dagger.AppComponent;
import com.ytl.dagger2demo.dagger.DaggerAppComponent;
import com.ytl.dagger2demo.dagger.DriverModule;

/**
 * Created by Richard Yi-Te Lu on 06,September,2019
 */
public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Hans"));
    }

    public AppComponent getAppComponent(){
        return component;
    }


}
