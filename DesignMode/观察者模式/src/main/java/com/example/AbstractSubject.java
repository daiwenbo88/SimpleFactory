package com.example;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by daiwenbo on 17/2/28.
 * 抽象被观察者
 */

public abstract class AbstractSubject {
    List<Observer> list=new ArrayList<>();
    public void attach(Observer observer){
        list.add(observer);
    }
    public void detach(Observer observer){
        list.remove(observer);
    }
    public abstract void notfiy(String content);

}
