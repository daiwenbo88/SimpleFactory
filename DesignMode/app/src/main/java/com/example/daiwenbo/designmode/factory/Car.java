package com.example.daiwenbo.designmode.factory;

/**
 * Created by daiwenbo on 17/2/14.
 */

public abstract class Car {

    protected String name;

    protected final static String CARSTYLE = "汽车";

    public abstract String drive();

    public String getName() {
        return this.name;
    }
}
