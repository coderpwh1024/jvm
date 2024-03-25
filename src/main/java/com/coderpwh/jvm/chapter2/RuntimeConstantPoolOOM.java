package com.coderpwh.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderpwh
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        int i=0;

        while (true){
            list.add(String.valueOf(i++).intern());
        }


    }

}
