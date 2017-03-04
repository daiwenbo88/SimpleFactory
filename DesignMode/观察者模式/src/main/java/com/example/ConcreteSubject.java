package com.example;

import java.util.Observable;

/**
 * Created by daiwenbo on 17/2/28.
 * 具体的被观察者
 */

public class ConcreteSubject extends AbstractSubject {
    @Override
    public void notfiy(String content) {
        for(Observer observer:list){
            observer.update(content);
        }
    }
}
