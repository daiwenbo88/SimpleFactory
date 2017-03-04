package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.print("下一个频道"+"\n");
    }

    @Override
    public void preChannel() {
        System.out.print("上一个频道"+"\n");
    }

    @Override
    public void turnOn() {
        System.out.print("开机了"+"\n");
    }

    @Override
    public void turnOff() {
        System.out.print("关机了"+"\n");
    }
}
