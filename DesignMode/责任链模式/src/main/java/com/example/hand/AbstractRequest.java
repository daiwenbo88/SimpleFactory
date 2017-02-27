package com.example.hand;

/**
 * Created by daiwenbo on 17/2/27.
 */

public abstract class AbstractRequest {
    private Object object;

    public AbstractRequest(Object object) {
        this.object=object;
    }

    /**
     * 具体的对象内容
     * @return
     */
    public Object getContent(){
        return object;
    }

    /**
     * 获取的请求级别
     * @return
     */
    public abstract  int getRequestLeve();
}
