package com.leetcode.ritvik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by u6023478 on 3/2/2017.
 * https://leetcode.com/problems/strobogrammatic-number-ii/?tab=Solutions
 */
public class Strobogrammatic {

    public static void main(String[] args) {
        Strobogrammatic strobogrammatic = new Strobogrammatic();
        System.out.println(strobogrammatic.findStrobogrammatic(4));
    }

    public List<String> findStrobogrammatic(int n) {
        findStrobogrammaticHelper(new char[n], 0, n - 1);
        return res;
    }

    List<String> res = new ArrayList<>();

    public void findStrobogrammaticHelper(char[] a, int l, int r) {
        System.out.println(Arrays.toString(a)+" l:"+l+" r:"+r);
        if (l > r) {
            res.add(new String(a));
            System.out.println(res);
            return;
        }
        if (l == r) {
            a[l] = '0'; res.add(new String(a));
            a[l] = '1'; res.add(new String(a));
            a[l] = '8'; res.add(new String(a));
            System.out.println(res);
            return;
        }

        if (l != 0) {
            a[l] = '0'; a[r] = '0';
            findStrobogrammaticHelper(a, l+1, r-1);
        }
        a[l] = '1'; a[r] = '1';
        findStrobogrammaticHelper(a, l+1, r-1);
        a[l] = '8'; a[r] = '8';
        findStrobogrammaticHelper(a, l+1, r-1);
        a[l] = '6'; a[r] = '9';
        findStrobogrammaticHelper(a, l+1, r-1);
        a[l] = '9'; a[r] = '6';
        findStrobogrammaticHelper(a, l+1, r-1);
    }
}
