package com.example;

/**
 * Created by daiwenbo on 17/3/4.
 */

public interface Iterator<T> {
    //是否还有下一个元素
    boolean hasNext();
    T next();
}
