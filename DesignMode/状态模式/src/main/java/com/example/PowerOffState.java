package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class PowerOffState implements TvState {
    @Override
    public void nextChannel() {
        System.out.print("无效"+"\n");
    }

    @Override
    public void preChannel() {
        System.out.print("无效"+"\n");
    }

    @Override
    public void turnOn() {
        System.out.print("无效"+"\n");
    }

    @Override
    public void turnOff() {
        System.out.print("关机了"+"\n");
    }
}
