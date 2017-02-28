package com.example.interpretor;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class Caculator {
    public int build(String num){
        Node left=null;
        Node right=null;
        Node lastNode=null;
        String[] statemnts=num.split(" ");
        for(int i=0;i<statemnts.length;i++){
            if("*".equalsIgnoreCase(statemnts[i])){//乘法

                left=lastNode;
                int val=Integer.parseInt(statemnts[++i]);
                right=new ValueNode(val);
                lastNode=new MulNode(left,right);

            }else  if("/".equalsIgnoreCase(statemnts[i])){//除法
                left=lastNode;
                int val=Integer.parseInt(statemnts[++i]);
                right=new ValueNode(val);
                lastNode=new DivNode(left,right);

            }else  if("%".equalsIgnoreCase(statemnts[i])){
                left=lastNode;
                int val=Integer.parseInt(statemnts[++i]);
                right=new ValueNode(val);
                lastNode=new ModeNode(left,right);

            } else {
                lastNode=new ValueNode(Integer.parseInt(statemnts[i]));
            }
        }
        return lastNode.interpret();
    }
}
