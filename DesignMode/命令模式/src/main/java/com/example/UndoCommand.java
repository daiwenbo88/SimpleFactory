package com.example;

/**
 * Created by daiwenbo on 17/2/28.
 *
 */

public class UndoCommand implements Command{
    private Army army;

    public UndoCommand(Army army) {
        this.army = army;
    }

    @Override
    public void excute() {
        army.attack();
    }

    @Override
    public void back() {
        army.back();
    }
}
