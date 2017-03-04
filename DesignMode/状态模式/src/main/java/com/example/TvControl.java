package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class TvControl {
    TvState mTvState;
    public  void setState(TvState mTvState){
        this.mTvState=mTvState;
    }
    public void powerOn(){
        setState(new PowerOnState());
        mTvState.turnOn();
    }
    public void powerOff(){
        setState(new PowerOffState());
        mTvState.turnOff();
    }
    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void preChannel() {
        mTvState.preChannel();
    }

    public void turnOn() {
        mTvState.turnOn();
    }

    public void turnOff() {
        mTvState.turnOff();
    }
}
