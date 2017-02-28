package com.example.interpretor;



/**
 * Created by daiwenbo on 17/2/27.
 * 实现类来做具体的运算
 */

public class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    /**
     * 计算方法(乘法)
     * @return
     */
    @Override
    public int interpret() {
        return left.interpret()*right.interpret();
    }
}
