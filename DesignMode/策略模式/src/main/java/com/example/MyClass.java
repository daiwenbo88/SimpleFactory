package com.example;

public class MyClass {
    public static void main(String[] args ){
        Strategy strategy=new Strategy1();
        MemberContext memberContext=new MemberContext(strategy);
        System.out.print("总价为："+memberContext.caculetor(100));
    }
}
