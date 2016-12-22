package com.ritvik;

/**
 * Created by u6023478 on 4/7/2016.
 */
public class LambaTest {
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Running one");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = () -> System.out.println("Running two");

        runnable1.run();
        runnable2.run();
    }

}
