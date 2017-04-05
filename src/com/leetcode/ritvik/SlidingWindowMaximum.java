package com.leetcode.ritvik;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Created by u6023478 on 3/6/2017.
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {

        System.out.println("------------"+Arrays.toString(new SlidingWindowMaximum().maxSlidingWindow(new int[]{1,2,1,4,5},4)));
    }

    public int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            System.out.println(".........i:"+i+" element:"+a[i]+" q:"+q+" ri:"+ri);
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            System.out.println("q:"+q);
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            System.out.println("q:"+q);
            // q contains index... r contains content
            q.offer(i);

            if (i >= k - 1) {
                r[ri] = a[q.peek()];
                ri++;
            }
            System.out.println("ri:"+ri);
            System.out.println("q:"+q);
        }
        return r;
    }
}
