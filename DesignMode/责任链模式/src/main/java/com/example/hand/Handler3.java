package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class Handler3 extends Handler {
    /**
     * 处理请求
     * @param abstractRequest
     */
    @Override
    public void handle(AbstractRequest abstractRequest) {
            System.out.print("Handler3---处理："+abstractRequest.getContent());
    }

    @Override
    public int getHandleLeve() {
        return 3;
    }
}
