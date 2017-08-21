package com.java;

import java.lang.*;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by u6023478 on 5/24/2017.
 */
public class ThreadObj implements Callable {
    int num;

    public ThreadObj(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("starting sleepy multiply... yawwwwwwn");
        TimeUnit.SECONDS.sleep(4);
        num = num*10;
        System.out.println(" done sleeping, returning...");
        return num;
    }

    public void run() {

    }
}
