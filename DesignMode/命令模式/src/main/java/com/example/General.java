package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 * 将军
 */

public class General {
    private Command unCommand;
    private  Command attackCommand;

    public General() {
        //构建士兵
        Soldier soldier=new Soldier();
        //构建军队
        Army army=new Army(soldier);

        unCommand=new UndoCommand(army);
        attackCommand =new AttachCommand(army);
    }

    /**
     * 皇帝调用进攻方法
     */
    public  void attach(){
        attackCommand.excute();
    }
    /**
     * 皇帝调用撤退方法
     */
    public void undo(){
        unCommand.back();
    }
}
