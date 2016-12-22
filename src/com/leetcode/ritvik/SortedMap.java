package com.leetcode.ritvik;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by u6023478 on 12/20/2016.
 */
public class SortedMap {

    public static void main(String[] args) {
        LinkedHashMap <String, Integer> map = new LinkedHashMap<>();
        map.put("s",2);
        map.put("d",1);
        map.put("e",3);
        TreeMap<String, Integer> sortedMap = sortMapByValue(map);
        for (String s : sortedMap.keySet()){
            System.out.println(s);
        }
    }

    public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
        Comparator<String> comparator = new ValueComparator(map);
        //TreeMap is a map sorted by its keys.
        //The comparator is used to sort the TreeMap by keys.
        TreeMap<String, Integer> result = new TreeMap<>(comparator);
        result.putAll(map);
        return result;
    }

    static class ValueComparator implements Comparator<String>{

        HashMap<String, Integer> map = new HashMap<>();

        public ValueComparator(HashMap<String, Integer> map){
            this.map.putAll(map);
        }

        @Override
        public int compare(String s1, String s2) {
            if(map.get(s1) >= map.get(s2)){
                return -1;
            }else{
                return 1;
            }
        }
    }
}
