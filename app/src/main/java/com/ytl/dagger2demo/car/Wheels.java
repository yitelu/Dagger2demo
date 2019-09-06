package com.ytl.dagger2demo.car;

/**
 * Created by Richard Yi-Te Lu on 05,September,2019
 */
public class Wheels {

    private Rims rims;
    private Tires tires;

//    @Inject
//    public Wheels() {
//    }

    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }

}
