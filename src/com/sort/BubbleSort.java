package com.sort;

/**
 * Created by u6023478 on 10/28/2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {1, 5, 2, 4, 3};
        array = bubbleSort(array);
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[array.length-1]);
    }


    public static int[] bubbleSort(int [] array){

        if (array.length <= 1)
            return array;

        boolean swapped = true;

        int steps = 0;

        while (swapped == true){

            swapped = false;

            for (int i = 1; i < array.length ; i++){
                //printArray("Current", array);
                if(array[i] < array[i-1]){
                    steps++;
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                    swapped = true;
                }

            }
        }

        System.out.println("Array is sorted in "+steps+" swaps.");
        return array;
    }

    private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: ");
        for(int i : x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
