package com.example.daiwenbo.designmode.factory;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class BackCar extends Car {
    public BackCar() {
        this.name="黑色";
    }

    @Override
    public String drive() {
        return name+Car.CARSTYLE;
    }
}
