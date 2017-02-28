package com.example.interpretor;

/**
 * Created by daiwenbo on 17/2/27.
 * 抽象的非终结符
 */

public  abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
