package com.coderpwh.jvm.chapter7;

public class Test {

    static  int i =1;


    static {

        i=0;

        System.out.println(i);   // 编译不通过，非法引用。将下面 static int i=1; 移到代码块前可以使用
    }

}
