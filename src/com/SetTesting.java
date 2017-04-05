package com;

import java.util.*;

/**
 * Created by u6023478 on 11/1/2016.
 */
public class SetTesting {

    static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        
        for(int j = 0; j<100; j++){
            list.add(j,0);
        }

        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(2);
        set.add(3);

        System.out.println("LinkedHashSet retains order:");
        for (Integer i : set){
            System.out.println(i);
        }

        set = new TreeSet<>();
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(2);
        set.add(3);

        System.out.println("TreeSet sorts:");
        for (Integer i : set){
            System.out.println(i);
        }
    }
}
