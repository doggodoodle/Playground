package com.leetcode.ritvik;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by u6023478 on 1/16/2017.
 */
public class Permutations {

    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        //System.out.println("perm1: prefix="+prefix+" s="+s);
        int n = s.length();
        if (n == 0) {
            System.out.println(prefix);
        }
        else {
            for (int i = 0; i < n; i++){
                String arg1 = prefix + s.charAt(i);
                String arg2 = s.substring(0, i) + s.substring(i+1, n);
                System.out.println("arg1="+arg1+" arg2="+arg2);
                perm1(arg1, arg2);
            }

        }

    }

    public static List<List<Integer>> permuteUnique(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Set<List<Integer>> result = new HashSet<>();
        permuteUnique(new ArrayList<>(0),list, result);
        List<List<Integer>> resList = new ArrayList<>(result);
        return resList;
    }

    static void permuteUnique(List<Integer> prefix, List<Integer> list, Set<List<Integer>> result){

        int size = list.size();

        if(size == 0){
            //System.out.println(prefix);
            result.add(prefix);

        }
        else{
            for (int i = 0; i < size; i++){
                List<Integer> list1 = new ArrayList<>(prefix);
                list1.add(list.get(i));
                List<Integer> list2 = new ArrayList<>(list.subList(0, i));
                list2.addAll(list.subList(i+1, size));
                //System.out.println("list1="+list1+" list2="+list2);
                permuteUnique(list1, list2, result);
            }
        }

    }

    public static void main(String[] args) {
        //perm1("123");
        int[] n = {3,3,1,2,3,2,3,1};
        System.out.println(permuteUnique(n));
    }

}
