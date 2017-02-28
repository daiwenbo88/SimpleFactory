package com.example.interpretor;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class ModeNode extends SymbolNode {
    public ModeNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret()%right.interpret();
    }
}
