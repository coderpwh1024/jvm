package com.coderpwh.jvm.chapter7;


/***
 *   下面的HELLOWORLD  常量在编译阶段已经存入NotInitialization类的常量池中，
 *   本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类初始化中
 */
public class ConstClass {

    static {
        System.out.println("ConstClass init!");
    }

    public  static  final  String HELLOWORLD="hello world";


}
