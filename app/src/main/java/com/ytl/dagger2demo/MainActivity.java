package com.ytl.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ytl.dagger2demo.car.Car;
import com.ytl.dagger2demo.dagger.CarComponent;
import com.ytl.dagger2demo.dagger.DaggerCarComponent;
import com.ytl.dagger2demo.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(2700))
                .build();

        component.inject(this);

        //car = component.getCar();
        car.drive();
    }
}
