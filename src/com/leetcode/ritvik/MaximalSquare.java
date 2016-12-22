package com.leetcode.ritvik;

import java.util.Arrays;

/**
 * Created by u6023478 on 12/22/2016.
 */
public class MaximalSquare {
    public static void main(String[] args) {
        char[][] matrix = new char[5][4];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<4; j++){
                matrix[i][j] = 1;
            }
        }
        matrix[3][3] = 0;
        System.out.println(getRange(matrix,1,1,3));
        //System.out.println(findReach(matrix, 0, 0));
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
