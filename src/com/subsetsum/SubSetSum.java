package com.subsetsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by u6023478 on 2/27/2017.
 */
public class SubSetSum {

    public static void main(String[] args) {
        int[] nums = {1,2};
        ;
    }

    private static void printPowerSet(ArrayList<Integer> integers) {
        List<List<Integer>> powerSet = getPowerSet(integers,0);
        powerSet.remove(0);
        for(List<Integer> set : powerSet){
            System.out.println(set);
        }
    }

    static List<List<Integer>> getPowerSet(List<Integer> list, int index){

        List<List<Integer>> powerSet;

        if(list.size() == index){
            powerSet = new ArrayList<>();
            powerSet.add(new ArrayList<>());
            return powerSet;
        }
        else{
            powerSet = getPowerSet(list, index+1);
            //System.out.println("index:"+index+" powerSet size:"+powerSet.size());
            Integer item = list.get(index);
            List<List<Integer>> moreSets = new ArrayList<>();
            //moreSets.addAll(powerSet);
            for(List<Integer> set : powerSet){
                //System.out.println("Adding item to "+set);
                List<Integer> s = new ArrayList<>();
                s.addAll(set);
                s.add(item);
                //set.add(item);
                moreSets.add(s);
            }
            powerSet.addAll(moreSets);
            //System.out.println("index:"+index+" powerSet size:"+powerSet.size());
        }



        return powerSet;
    }


}
