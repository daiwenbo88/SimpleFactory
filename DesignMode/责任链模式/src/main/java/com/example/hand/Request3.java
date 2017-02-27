package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public class Request3 extends AbstractRequest {

    public Request3(Object object) {
        super(object);
    }

    @Override
    public int getRequestLeve() {
        return 3;
    }
}
