package com.ritvik;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by u6023478 on 4/7/2016.
 */
public final class ReverseWords {

    static {
        System.out.println("ReverseWords static block loaded.");
    }

    public static void dummy(int i) {
        System.out.println("called dummy"+ i);
    }

    public static void main(String[] args) throws  Exception {
        Scanner sc = new Scanner(new FileInputStream(new File("resc/B-large-practice.in")));
        String n = sc.nextLine();
        int i = 1;
        while(sc.hasNext()){
            Scanner sc2 = new Scanner(sc.nextLine());
            Stack<String> stack = new Stack<String>();
            while(sc2.hasNext()){
                stack.push(sc2.next());
            }
            sc2.close();
            StringBuilder sb = new StringBuilder();

            while(stack.size() > 0)
                sb.append(stack.pop()+" ");

            System.out.println("Case #"+i+": "+sb.toString());
            i++;
        }
    }

}
