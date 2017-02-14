package com.example.daiwenbo.designmode.simpefactory;

import com.example.daiwenbo.designmode.annotatio.CarColor;

/**
 * Created by daiwenbo on 17/2/14.
 */
@CarColor(color = "BULE")
public class BuleCar extends Car {
    @Override
    public String drive() {
        return name+Car.CARSTYLE;
    }
}
