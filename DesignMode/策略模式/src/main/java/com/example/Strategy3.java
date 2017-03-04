package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class Strategy3 implements Strategy {
    @Override
    public double strategyInterface(double price) {
        System.out.print("不是会员,不享受打折");
        return price;
    }
}
