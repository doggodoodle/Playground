package com.leetcode.ritvik;

import java.util.Arrays;

/**
 * Created by u6023478 on 1/27/2017.
 */
public class SearchRange {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(searchRange(new int []{1,2,3,3,3,3,3,3},3)));

        String s = "\t\tsdf.df";
        int count = 0;

    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n==0 || target<nums[0] || target>nums[n-1])
            return new int[]{-1,-1};


        int b = 0;
        int e = n-1;
        int start = -1;
        int end = -1;

        while(b <= e){

            int mid = (b+e)/2;
            //System.out.println("b:"+b+" e:"+e+" mid:"+mid);
            if(nums[mid] == target && (mid == 0 || nums[mid-1] != target)){
                start = mid;
                break;
            }
            else if(nums[mid] < target){
                b = mid+1;
            }
            else if(nums[mid] >= target){
                e = mid-1;
            }
        }

        //System.out.println("start:"+start);


        b = start;
        e = n-1;

        while(b <= e){
            int mid = (b+e)/2;
            //System.out.println("b:"+b+" e:"+e+" mid:"+mid);
            if(nums[mid] == target && (mid == n-1 || nums[mid+1] != target)){
                end = mid;
                break;
            }

            else if(nums[mid] <= target ){
                b = mid+1;
            }
            else if(nums[mid] > target){
                e = mid-1;
            }
        }
        //System.out.println("end:"+end);

        return new int[]{start,end};

    }
}
