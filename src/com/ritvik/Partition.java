package com.ritvik;

import java.math.BigInteger;

/**
 * Created by u6023478 on 3/10/2015.
 */
public class Partition {
    /*public static void main(String[] args) {
        //Partition p = new Partition();
        //p.partition(5);
    }*/

    void partition(int n){
        for (int i=1; (i-1)<n/2; i++){
            System.out.println(n-i+"-"+i);
            if(n-i>1){
               partition(n-i);
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
       ReverseWords.dummy(1);
        /*
        System.out.println("name="+ReverseWords.class.getName());
        ClassLoader.getSystemClassLoader().loadClass(ReverseWords.class.getName());
        ReverseWords.dummy(2);*/
        int i = 3, j = 9;
        j++;
        BigInteger num = BigInteger.valueOf(i);
        num = num.multiply(BigInteger.valueOf(j));
        num = num.multiply(BigInteger.valueOf(j));
        System.out.println(num);
    }
}
