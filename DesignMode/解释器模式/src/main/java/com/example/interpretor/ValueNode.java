package com.example.interpretor;

/**
 * Created by daiwenbo on 17/2/27.
 */

/**
 *终结符
 */

public class ValueNode implements Node{
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
