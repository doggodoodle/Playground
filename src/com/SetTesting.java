package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by u6023478 on 11/1/2016.
 */
public class SetTesting {
    public static void main(String[] args) {
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
