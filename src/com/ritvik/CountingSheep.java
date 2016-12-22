package com.ritvik;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by u6023478 on 4/8/2016.
 */
public class CountingSheep {

    public static void main(String[] args) {

        Scanner sc = null;
        //sc = new Scanner(System.in);
        try {
            sc = new Scanner(new File("resc/A-large.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int n = sc.nextInt();
        //System.out.println(n);

        for (int i=0; i < n; i++){

            result(sc.nextBigInteger(), (i+1));

        }

        sc.close();

    }

    private static void result(BigInteger num, int i) {

        if (num.compareTo(BigInteger.ZERO) == 0){
            System.out.println("Case #"+i+": INSOMNIA");
            return;
        }

        HashSet<Integer> set = new HashSet<Integer>();

        //System.out.println("out - "+num);

        int j = 0;

        BigInteger res = null;

        while(set.size()<10){
            j++;
           // System.out.println("mult by "+j);
            //System.out.println("num pre= "+num);
            BigInteger num2 = num.multiply(BigInteger.valueOf(j));
            res = num2;
            //System.out.println("num post= "+num2);
            BigInteger[] resultAndRemainder;
            do {

                resultAndRemainder = num2.divideAndRemainder(BigInteger.TEN);
                set.add(Math.abs(resultAndRemainder[1].intValue()));
                //System.out.println(Math.abs(resultAndRemainder[1].intValue()));
                num2 = resultAndRemainder[0];
                //System.out.println(set);
            } while (num2.compareTo(BigInteger.ZERO) != 0);
        }
        System.out.println("Case #"+i+": "+ res);




    }
}
