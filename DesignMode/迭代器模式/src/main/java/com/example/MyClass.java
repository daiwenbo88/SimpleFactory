package com.example;

public class MyClass {
    public static  void main(String[] args){
        Aggregate<String> aggregate=new ConcreteAggregate<>();
        aggregate.add("张三");
        aggregate.add("李四");
        Iterator<String> iterator=aggregate.iteratoe();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\n");
        }
    }
}
