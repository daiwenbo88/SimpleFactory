package com.example;

import com.example.interpretor.Caculator;

public class MyClass {
    public static void main(String[] args){
        String content="3 * 5 * 7 / 3 % 30";
        Caculator caculator=new Caculator();
        int num=caculator.build(content);
        System.out.print("最后的结果为："+num);
    }
}
