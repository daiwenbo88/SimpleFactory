package com.example.daiwenbo.designmode.annotatio;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by daiwenbo on 17/2/14.
 */
@Target(ElementType.TYPE)//用于描述类、接口(包括注解类型) 或enum声明
@Retention(RetentionPolicy.RUNTIME)//即运行时保留
@Documented //用于描述其它类型的annotation应该被作为被标注的程序成员的公共API
@Inherited //修饰的annotation类型被用于一个class 则这个Annotation将被用于该class的子类。
public @interface CarColor {
    String color() default "";
}
