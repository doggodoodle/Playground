package com.leetcode.ritvik;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by u6023478 on 3/2/2017.
 * https://leetcode.com/problems/decode-string/?tab=Description
 */
public class DecodeString {
    public static void main(String[] args) {
        String s = "b10[1[a]]";
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        map.putAll(map2);
        char c = '1';
        System.out.println(Character.getNumericValue(c));

    }

    public String decodeString(String s) {

        return null;
    }



    boolean isDigit(char c){
        return c>='0' && c<='9';
    }
}
