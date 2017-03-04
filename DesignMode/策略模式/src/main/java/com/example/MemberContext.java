package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class MemberContext {
    private Strategy strategy;

    public MemberContext(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 计算打折后的价格
     * @param price
     * @return
     */
    public double caculetor(double price){
        return  strategy.strategyInterface(price);
    }
}
