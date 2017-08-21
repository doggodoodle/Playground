package com.java;

/**
 * Created by u6023478 on 5/1/2017.
 */
public class RunnableThreadB extends Thread{

    Object object;

    public RunnableThreadB(Object object){
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("Thread B going to call methodB...");
        object.methodB();
    }
}
