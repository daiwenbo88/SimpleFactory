package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

/**
 * 抽象策略角色
 */

public interface Strategy {
    /**
     *
     * @param price 调用层传进来的原价
     * @return 打折后的价格
     */
    double strategyInterface(double price);
}
