package test.com.ritvik;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Created by u6023478 on 11/3/2016.
 */
public class Test {
    public static void main(String[] args) {
        String [] cities = {"A","P","B"};
        MySort mySort = new MySort();
        Arrays.sort(cities, mySort);
        System.out.println(Arrays.binarySearch(cities,"P"));


    }

    static class MySort implements Comparator{
        public int compare(String a, String b){
            return b.compareTo(a);
        }

        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

}
