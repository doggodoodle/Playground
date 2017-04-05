package com.leetcode.ritvik;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Created by u6023478 on 12/22/2016.
 */
public class MaximalSquare {
    public static class TreeNode {
     int val;

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }

        TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(-1);
        node.left = new TreeNode(0);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(-2);
        node.left.right = new TreeNode(4);
        node.left.left.left = new TreeNode(8);

        System.out.println(lowestCommonAncestor(node, node.left.left.left,node.left ));
    }


    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        Queue<TreeNode> qu = new ArrayDeque<TreeNode>();
        qu.offer(root);
        TreeNode res = null;

        while(!qu.isEmpty()){
            TreeNode n = qu.poll();
            System.out.println("Checking:"+n.val);
            if( (n == p && (contains(n.right,q) || contains(n.left,q)))
                    ||  (n == q && (contains(n.right,p) || contains(n.left,p)))
                    ){
                //System.out.println("Result="+n.val);
                res = n;
                return res;
            }
            else if( (contains(n.left,p) || (contains(n.left,q)))  && (contains(n.right,p) || contains(n.right,q))){
                //System.out.println("Result="+n.val);
                res = n;
                return res;

            }
            if(n.left !=null)
                qu.offer(n.left);
            if(n.right!=null)
                qu.offer(n.right);
        }

        return res;
    }

    static boolean  contains(TreeNode root, TreeNode p){
        System.out.println("contains : root="+root+" key="+p);
        if(root == null)
            return false;
        if(root == p){
            System.out.println("returning true for root="+root);
            return true;
        }


        return (contains(root.left, p) || contains(root.right, p));
    }

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 1){
                    int scope = Math.min(rows - i, cols - j);
                    if(scope > max){
                        int range = getRange(matrix, i, j , scope);
                        if(max < range)
                            max = range;
                    }

                }
            }
        }
        return max;
    }

    static int getRange(char[][] matrix, int i , int j, int scope){
        int max = 0;
        for(int limit = 1; limit < scope; limit++){
            for(; i < limit; i++){
                for(; j< limit; j++){
                    if(matrix[i][j] != 1)
                        return max;
                }
            }
            max++;
        }
        return max;
    }
}
