package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class Strategy2 implements Strategy {
    @Override
    public double strategyInterface(double price) {
        System.out.print("一般会员享九折");
        return price*0.9;
    }
}
