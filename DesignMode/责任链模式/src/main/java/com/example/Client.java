package com.example;

import com.example.hand.Handler1;
import com.example.hand.Handler2;
import com.example.hand.Handler3;
import com.example.hand.Request1;
import com.example.hand.Request2;
import com.example.hand.Request3;

public class Client {
    public static void main(String[] args ){
        Handler1 handler1=new Handler1();
        Handler2 handler2=new Handler2();
        Handler3 handler3=new Handler3();
        handler1.nextHandler=handler2;
        handler2.nextHandler=handler3;

        Request3 request3=new Request3("请求3");
        handler1.handleRequest(request3);
    }
}
