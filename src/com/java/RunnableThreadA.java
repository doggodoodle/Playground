package com.java;

/**
 * Created by u6023478 on 5/1/2017.
 */
public class RunnableThreadA extends Thread{

    Object object;

    public RunnableThreadA(Object object){
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("Thread A going to call methodA...");
        object.methodA();
    }
}
