package com.example.daiwenbo.designmode.simpefactory;

import com.example.daiwenbo.designmode.annotatio.CarColor;

/**
 * Created by daiwenbo on 17/2/14.
 */

public class CarFactory2 {

    public static <T extends Car> T newCar(Class<T> c) {
        Car car = null;
        String identifier = null;
        try {
            Class componentClass = Class.forName(c.getName());
            if (componentClass.isAnnotationPresent(CarColor.class)) {//制定类型的注释存在该元素之上
                CarColor component = (CarColor) componentClass.getAnnotation(CarColor.class);
                identifier = component.color();
                System.out.println(String.format("颜色：' %s '", identifier));
            } else {
                System.out.println("com.jasongj.UpperCaseComponent is not annotated by"
                        + " com.jasongj.annotation.Component");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        try {
            car = (Car) Class.forName(c.getName()).newInstance();
            car.name = identifier;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
