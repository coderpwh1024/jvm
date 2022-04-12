package com.coderpwh.jvm.chapter2;

public class JavaVmStackOOM {

    public static void main(String[] args) {

         JavaVmStackOOM oom = new JavaVmStackOOM();
         oom.stackLeakByThread();

    }

    private void dontStop(){
        while (true){

        }
    }

    public  void stackLeakByThread(){

        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                   dontStop();
                }
            });
        }
    }
}
