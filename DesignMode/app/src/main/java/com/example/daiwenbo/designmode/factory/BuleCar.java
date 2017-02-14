package com.example.daiwenbo.designmode.factory;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class BuleCar extends Car {
    @Override
    public String drive() {
        return name+Car.CARSTYLE;
    }
}
