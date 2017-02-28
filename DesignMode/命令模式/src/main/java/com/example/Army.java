package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 * 军队
 * 具体执行任务
 */

public class Army {
    //军队持有士兵引用
    private Soldier soldier;

    public Army(Soldier soldier) {
        this.soldier = soldier;
    }
    public  void attack(){
        soldier.setAttach("攻打齐国");
        System.out.print(soldier.getAttach()+"\n");
    }
    public void back(){
        soldier.setBack("撤退");
        System.out.print(soldier.getBack());
    }
}
