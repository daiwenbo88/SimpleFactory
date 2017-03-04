package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daiwenbo on 17/3/4.
 */
//具体的迭代角色
public class ConcreteItetor<T> implements Iterator<T> {
    private List<T> list=new ArrayList<>();

    public ConcreteItetor(List<T> list) {
        this.list = list;
    }

    private  int cursor=0;
    @Override
    public boolean hasNext() {
        return cursor!=list.size();
    }

    @Override
    public T next() {
        T obj=null;
        if(this.hasNext()){
            obj=list.get(cursor++);
        }
        return obj;
    }
}
