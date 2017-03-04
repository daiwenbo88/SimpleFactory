package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 * 具体的观察者
 */

public class ConcreteObserver implements Observer{
    @Override
    public void update(String str) {
        System.out.print(str+"收到更新消息"+"\n");
    }
}
