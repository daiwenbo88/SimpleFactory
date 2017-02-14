package com.example.daiwenbo.designmode.factory;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class CarFactory {
    public static Car newCar(String color){
        Car car=null;
        switch (color){
            case "黑色":
                car=new BackCar();
                break;
            case "红色":
                car=new RedCar();
                break;
            case "蓝色":
                car=new BuleCar();
                break;
        }
        return car;
    }
}
