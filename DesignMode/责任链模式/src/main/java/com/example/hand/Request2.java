package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class Request2 extends AbstractRequest {

    public Request2(Object object) {
        super(object);
    }

    @Override
    public int getRequestLeve() {
        return 2;
    }
}
