package com.ritvik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by u6023478 on 10/10/2016.
 *
 * https://www.hackerrank.com/challenges/30-2d-arrays
 */
public class HourGlassMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        List<Integer> sum = new ArrayList<>();

        for(int i = 0; i < arr[0].length/2+1; i++){
            for (int j = 0; j < arr[0].length/2+1; j++){
                System.out.println("..."+arr[i][j]);
                sum.add(printHourGlass(arr,i,j));
            }
            System.out.println("next hg");
        }

        System.out.println("sumList = "+ sum);

        int maxSum = sum.get(0);

        for (Integer i : sum){
            if(i>maxSum)
                maxSum = i;
        }

        System.out.println( "Max sum = "+maxSum);


    }

    public static int printHourGlass(int arr[][], int x, int y){
        int sum = 0;
        for(int i = x; i < x+3; i++){
            for(int j = y; j < y+3; j++){
                if(!((i==x+1 && j==y)|| (i==x+1 && j==y+2))){
                    System.out.print (arr[i][j]+ " ");
                    sum = sum + arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("sum = "+ sum);
        return sum;
    }
}
