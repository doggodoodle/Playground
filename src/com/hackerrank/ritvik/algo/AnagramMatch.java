package com.hackerrank.ritvik.algo;

import java.util.*;

/**
 * Created by u6023478 on 11/9/2016.
 */
public class AnagramMatch {
    public static int numberNeeded2(String first, String second) {

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(int i = 0; i< first.length(); i++){
            Character c = first.charAt(i);
            if(map1.containsKey(c))
                map1.put(c, map1.get(c)+1);
            else
                map1.put(c, 1);
        }

        for(int i = 0; i< second.length(); i++){
            Character c = second.charAt(i);
            if(map2.containsKey(c))
                map2.put(c, map2.get(c)+1);
            else
                map2.put(c, 1);
        }

        System.out.println(map1);
        System.out.println(map2);

        for(Character c : map1.keySet()){
            if(map1.get(c)==0)
                continue;
            if(map2.containsKey(c) && map2.get(c)>0){

                map1.put(c, map1.get(c)-1);
                map2.put(c, map2.get(c)-1);
            }
        }
        for(Character c : map2.keySet()){
            if(map2.get(c)==0)
                continue;
            if(map1.containsKey(c) && map1.get(c)>0){
                System.out.println("removing sec "+c);
                map1.put(c, map1.get(c)-1);
                map2.put(c, map2.get(c)-1);
            }
        }
        System.out.println("----");
        System.out.println(map1);
        System.out.println(map2);

        int res = 0;

        for(Character c : map1.keySet()){
            res = res + map1.get(c);
        }

        for(Character c : map2.keySet()){
            res = res + map2.get(c);
        }

        return res;



    }

    public static int numberNeeded3(String first, String second) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : first.toCharArray()){
            System.out.println("element:"+c+" |iter1:"+map);
            map.put(c, (map.containsKey(c)?(map.get(c)+1):1));
        }
        System.out.println(map);
        for(char c : second.toCharArray()){
            System.out.println("element:"+c+" |iter2:"+map);
            map.put(c, (map.containsKey(c)?(map.get(c)-1):-1));
        }
        System.out.println(map);

        int res = 0;

        for(int i : map.values()){
            res += Math.abs(i);
        }

        return res;

    }

    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> count = new HashMap<>();

        for( char ch: first.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct + 1));
        }
        System.out.println(count);


        for( char ch: second.toCharArray() ) {
            int ct = count.containsKey(ch) ? count.get(ch) : 0;
            count.put(ch, (ct - 1));
        }

        System.out.println(count);

        List<Integer> values = new ArrayList<>( count.values() );
        int total = 0;
        for( Integer v: values ) {
            total += Math.abs(v);
        }
        return total;
    }

   /* public static int numberNeeded(String first, String second) {
        int count = 0;
        int[] freq = new int[26];
        for (char c : first.toCharArray())
            freq[c - 'a']++;
        for (char c : second.toCharArray())
            freq[c - 'a']--;
        for (int i : freq){
            count += Math.abs(i);
            System.out.println(i);
        }

        return count;
    }*/

    public static void main(String[] args) {

       /* char a = 'A';
        System.out.println((int)a);*/
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
        System.out.println("*************");
        System.out.println(numberNeeded2(a, b));
        System.out.println("-----3-------------");
        System.out.println(numberNeeded3(a,b));
    }


}
