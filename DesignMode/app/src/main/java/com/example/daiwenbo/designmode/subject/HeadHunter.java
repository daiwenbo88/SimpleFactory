package com.example.daiwenbo.designmode.subject;

import com.example.daiwenbo.designmode.observer.ITalent;


/**
 * Created by daiwenbo on 17/2/14.
 */

public class HeadHunter extends AbstractHR {
    @Override
    public void publishJob(final String job) {
        //循环遍历 发送通知
        for(ITalent iTalent:collection){
            iTalent.newJob(job);
        }
    }
}
