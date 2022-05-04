package com.coderpwh.jvm.chapter7;


/***
 * 子类:
 * 通过子类引用父类的静态字段，不会导致子类初始化
 */
public class SubClass  extends  SuperClass{


    static {
        System.out.println("SubClass init!");
    }




}
