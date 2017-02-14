package com.example.daiwenbo.designmode.factory;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class RedCar extends Car {
    public RedCar() {
        this.name="红色";
    }

    @Override
    public String drive() {
        return name+Car.CARSTYLE;
    }
}
