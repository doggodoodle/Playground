package com.java;

import java.util.concurrent.TimeUnit;

/**
 * Created by u6023478 on 5/1/2017.
 */
public class Object {

    synchronized void methodA(){
        System.out.println("method A called...");
        try {

            int i = 10;
            while(i-- >= 0){
                System.out.println("Sleeping "+i);
                TimeUnit.SECONDS.sleep(1);
                innerMethod();
            }
            System.out.println("FINISHED method A");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void methodB(){

        innerMethod();
        System.out.println("method B called inner...");
    }

    synchronized void innerMethod(){
        System.out.println("Inner method called...");
    }
}
