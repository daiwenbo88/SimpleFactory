package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daiwenbo on 17/3/4.
 */
//具体的容器
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list=new ArrayList<>();
    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iteratoe() {

        return new ConcreteItetor<>(list);
    }
}
