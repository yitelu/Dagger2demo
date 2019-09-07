package com.ytl.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ytl.dagger2demo.car.Car;
import com.ytl.dagger2demo.dagger.ActivityComponent;
import com.ytl.dagger2demo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponentFactory().create(150, 1400);

        component.inject(this);

        //car = component.getCar();
        car1.drive();
        car2.drive();
    }
}
