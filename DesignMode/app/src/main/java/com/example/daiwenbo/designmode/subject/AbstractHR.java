package com.example.daiwenbo.designmode.subject;

import com.example.daiwenbo.designmode.observer.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by daiwenbo on 17/2/14.
 */

public abstract class AbstractHR {
    protected ArrayList<ITalent> collection = new ArrayList<>();

    public abstract void publishJob(String job);

    public void addTalent(ITalent it){
        collection.add(it);
    }
    public void removeITalent(ITalent iTalent){
        collection.remove(iTalent);
    }
}
