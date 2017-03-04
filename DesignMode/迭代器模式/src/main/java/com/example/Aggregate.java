package com.example;

/**
 * Created by daiwenbo on 17/3/4.
 */
//容器接口
public interface Aggregate<T> {
    void add(T t);
    void remove(T  t);
    Iterator<T> iteratoe();
}
