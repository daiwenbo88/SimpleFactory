package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class Request1 extends AbstractRequest {

    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLeve() {
        return 1;
    }
}
