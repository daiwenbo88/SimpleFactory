package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public  abstract class Handler {
    public Handler nextHandler;
    public void handleRequest(AbstractRequest abstractRequest){
        if(getHandleLeve()==abstractRequest.getRequestLeve()){
            handle(abstractRequest);
        }else {
            if(null!=nextHandler){
                nextHandler.handleRequest(abstractRequest);
            }else {
                System.out.print("链式调用结束");
            }
        }
    }

    /**
     * 每个对象的处理方式
     * @param abstractRequest
     */
     public abstract void handle(AbstractRequest abstractRequest);

    /**
     * 每个对象的处理级别
     * @return
     */
     public abstract int getHandleLeve();
}
