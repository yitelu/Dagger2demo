package com.ytl.dagger2demo.car;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Richard Yi-Te Lu on 06,September,2019
 */

//@Singleton
public class Driver {
    //we don't own this class so we can't annotate it with @Inject

//    @Inject
//    public Driver() {
//    }

    String name;

    public Driver(String name) {
        this.name = name;
    }
}
