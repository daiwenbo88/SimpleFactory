package com.example.daiwenbo.designmode.observer;

import android.util.Log;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class Architect implements ITalent {
    @Override
    public void newJob(String job) {
        Log.e("TAG",job);
        System.out.print("我的工作是：" + job);
    }
}
