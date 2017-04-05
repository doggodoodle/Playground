package com.GeeksForGeeks;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by u6023478 on 2/9/2017.
 */
public class BookStacks
{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] a = new int [n];

            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
            }
            System.out.println(max_Books(a, n, k));
        }
    }
    static int max_Books(int a[], int n, int k)
    {
        // Your code here
        int m = 0;
        int st = 0;
        for(int i=0; i < a.length; i++){
            if(a[i] <= k){
                st = st + a[i];
            }
            else{
                if(m < st)
                    m = st;
                st = 0;
            }
            if(i == a.length -1)
                if(m < st)
                    m = st;
        }



        return m;

    }
}
