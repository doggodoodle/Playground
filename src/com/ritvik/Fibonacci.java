package com.ritvik;

import java.util.ArrayList;

/**
 * Created by u6023478 on 2/17/2015.
 */
public class Fibonacci {

    public <T extends Object> Fibonacci(T n) {

        if(n instanceof Number){
            ArrayList arr = new ArrayList();
        }

        else{
            System.out.println("FkOff");
        }

    }

    public static void main(String[] args) {
        new Fibonacci("ssdf");
    }
}
