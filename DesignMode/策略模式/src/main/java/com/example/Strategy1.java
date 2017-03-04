package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class Strategy1 implements Strategy {
    @Override
    public double strategyInterface(double price) {
        System.out.print("高级会员八折");
        return price*0.8;
    }
}
