package com.java;

import java.util.concurrent.TimeUnit;

/**
 * Created by u6023478 on 5/1/2017.
 */
public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread runnableThreadA = new RunnableThreadA(object);
        Thread runnableThreadB = new RunnableThreadB(object);

        runnableThreadA.start();
        System.out.println(" A started........");
        TimeUnit.SECONDS.sleep(1);
        runnableThreadB.start();
        System.out.println(" both A and B threads started////");

        //System.out.println("accessing inner");
        //objectA.innerMethod();
        //System.out.println("Accessed inner from outside");

    }
}
