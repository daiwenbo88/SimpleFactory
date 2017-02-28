package com.example.interpretor;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class DivNode extends SymbolNode{
    public DivNode(Node left, Node right) {
        super(left, right);
    }

    /**
     * 计算方法(除法)
     * @return
     */
    @Override
    public int interpret() {
        return left.interpret()/right.interpret();
    }
}
