package com.hackerrank.ritvik.algo;

import java.util.*;

/**
 * Created by u6023478 on 11/9/2016.
 */
public class IceCreamBinary {
   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            //print(a);
            int r1=0;
            boolean found = false;
            for(int i = 0 ; i < n; i ++){
                r1 = a[i];
                for(int j = 0; j < n; j++){
                    if((a[j]==m-r1) && (i !=j)){

                        System.out.println((i+1)+" "+(j+1));
                        found = true;
                        break;
                    }
                }
                if(found)
                    break;
            }
        }
    }*/

   /* static String sortSegments(String s) {
        List<String> segments = parse(s);
        for(String str : segments){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
        }


    }*/

    static List<String> parse(String s){
        List<String> segs = new ArrayList<>();
        int b = 0, e = 0;
        int currentType;
        while (e < s.length()) {
            currentType = typeOf(s.charAt(e));
            if (currentType != 0) {
                do {
                    e++;
                } while (e < s.length() && currentType == typeOf(s.charAt(e)));
                segs.add(s.substring(b, e));
            } else {
                e++;
            }
            b = e;
        }
        return segs;
    }
    static int typeOf(char c) {
        if ('A' <= c && c <= 'Z')
            return 1;
        else if ('0' <= c && c <= '9')
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(parse("ABAC123PWR"));
    }

    static void print(int [] a){
        System.out.print("a=");
        for(int i = 0; i < a.length; i ++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");

    }

}
