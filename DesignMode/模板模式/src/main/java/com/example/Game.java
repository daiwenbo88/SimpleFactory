package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 */

public abstract class Game {
    abstract  void  login();
    abstract  void startPlay();
    abstract  void endPlay();
    //声明为final 防止子类重写
    public final void play(){
        System.out.print("开机"+"\n");
        login();
        startPlay();
        endPlay();
        System.out.print("关机"+"\n");

    }
}
