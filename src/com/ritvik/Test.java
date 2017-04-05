package com.ritvik;

import com.leetcode.ritvik.KReverseLinkedList;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by u6023478 on 10/10/2016.
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(3|4));
    }

    public static long reverseBits(Integer n) {



        String s = Integer.toBinaryString(n);
        if(s.length() < 32){
            int diff = 32 - s.length();
            StringBuilder stringBuilder = new StringBuilder();
            while (diff > 0){
                stringBuilder.append("0");
                diff--;
            }
            stringBuilder.append(s);
            s = stringBuilder.toString();
        }
        System.out.println(s);
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length -1; i>=0; i--){
            if(arr[i]!='-'){
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
        //System.out.println(sb.toString());

        //System.out.println("rev"+sb.toString());
        return Math.abs((int)Long.parseLong(sb.toString() , 2));




    }

    public static int compareVersion(String version1, String version2) {
        String [] arr1 = version1.split("\\.");
        String [] arr2 = version2.split("\\.");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for(int i = 0; i < arr1.length; i++){

            if(i > arr2.length-1){
                for(int j = i; j<arr1.length; j++){
                    if(Integer.parseInt(arr1[j]) != 0)
                        return 1;
                }
                return 0;

            }

            if(Integer.parseInt(arr1[i]) == Integer.parseInt(arr2[i]))
                continue;
            else{
                return compare(Integer.parseInt(arr1[i]),Integer.parseInt(arr2[i]));
            }

        }

        if(arr2.length > arr1.length){
            for(int j = arr1.length; j<arr2.length; j++){
                if(Integer.parseInt(arr2[j]) != 0)
                    return -1;
            }
            return 0;
        }


        return 0;

    }

    static int compare(int a, int b){

        if(a>b)
            return 1;
        if(a<b)
            return -1;
        return 0;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode reverseList(ListNode head) {

        ListNode newHead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return newHead;

    }




}
