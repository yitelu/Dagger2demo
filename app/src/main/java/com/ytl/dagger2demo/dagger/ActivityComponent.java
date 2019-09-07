package com.ytl.dagger2demo.dagger;

import com.ytl.dagger2demo.MainActivity;
import com.ytl.dagger2demo.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */

@PerActivity
@Subcomponent (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    @Subcomponent.Builder
////    interface Builder{
////
////        @BindsInstance
////        Builder horsePower(@Named("horse power")int horsePower);
////
////        @BindsInstance
////        Builder engineCapacity(@Named("engine capacity")int engineCapacity);
////
////        //Builder appComponent(AppComponent component);
////
////        ActivityComponent build();
////
////    }

    @Subcomponent.Factory
    interface Factory {

        ActivityComponent create(@BindsInstance @Named("horse power")int horsePower,
                                 @BindsInstance @Named("engine capacity")int engineCapacity);
    }

}
