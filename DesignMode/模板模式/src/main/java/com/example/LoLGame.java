package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public class LoLGame extends Game {
    @Override
    void login() {
        System.out.print("登录"+"\n");
    }

    @Override
    void startPlay() {
        System.out.print("开始游戏"+"\n");
    }

    @Override
    void endPlay() {
        System.out.print("结束游戏"+"\n");

    }
}
