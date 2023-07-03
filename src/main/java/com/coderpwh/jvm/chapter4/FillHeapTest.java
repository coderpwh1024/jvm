package com.coderpwh.jvm.chapter4;

import java.util.ArrayList;
import java.util.List;


public class FillHeapTest {

    public static void main(String[] args) throws Exception {

        fillHeap(1000);
    }

    public static void fillHeap(int num) throws Exception {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            Thread.sleep(50);
            list.add(new OOMObject());
        }
    }
}
