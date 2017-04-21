package com.leetcode.ritvik;

/**
 * Created by u6023478 on 4/21/2017.
 * https://leetcode.com/problems/decode-string/?tab=Description
 */
public class DecodeString {
    public static void main(String[] args) {
        String s = "b10[1[a]]";
        DecodeString decodeString = new DecodeString();
        System.out.println(decodeString.decodeString(s));

    }

    public String decodeString(String s) {
        while(s.indexOf("]")!=-1){
            s = decodeFirst(s);
        }
        return s;
    }

    String decodeFirst(String s){
        int close = s.indexOf("]");
        int i = close-1;
        int open = -1;
        while(--i>0 && open==-1){
            if(s.charAt(i)=='['){
                open = i;
                break;
            }
        }
        while(--i>=0){
            if(s.charAt(i)<'0' || s.charAt(i)>'9')
                break;
        }
        int numStart = i+1;
        int k = Integer.parseInt(s.substring(numStart, open));
        String sub = s.substring(open+1, close);
        StringBuilder sbSub = new StringBuilder();
        for(int j = 0; j<k; j++){
            sbSub.append(sub);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, numStart));
        sb.append(sbSub.toString());
        sb.append(s.substring(close+1, s.length()));
        return sb.toString();
    }
}
