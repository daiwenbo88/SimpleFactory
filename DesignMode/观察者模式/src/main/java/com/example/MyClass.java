package com.example;

public class MyClass {
    public static void main(String[] args){
        //建立被观察者
        AbstractSubject abstractSubject=new ConcreteSubject();
        //创建观察者
        ConcreteObserver observer1=new ConcreteObserver();
        ConcreteObserver observer2=new ConcreteObserver();
        ConcreteObserver observer3=new ConcreteObserver();

        abstractSubject.attach(observer1);
        abstractSubject.attach(observer2);
        abstractSubject.attach(observer3);
        //被观察者发出更新消息 使观察者能接收到
        abstractSubject.notfiy("观察者");

    }

}
