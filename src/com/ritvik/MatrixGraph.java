package com.ritvik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6023478 on 4/7/2016.
 *
 * Input a given a 2D array, with valid and invalid values. Start from 0,0 and reach
 * n,n traversing only through valid values.
 *
 */
public class MatrixGraph {
    public static void main(String[] args) {
        MatrixGraph matrixGraph = new MatrixGraph();

        int [][] inputMatrix = {
                {2,0,0,0},
                {1,0,0,0},
                {1,1,1,1},
                {1,1,0,5}
        };

        //System.out.println(inputMatrix[1][0]);

        HashMap<String, GNode> map = new HashMap<String, GNode>();

        for(int i = 0; i < inputMatrix[0].length; i++){
            for(int j =0; j < inputMatrix[1].length; j++){
                //System.out.println(inputMatrix[i][j]);
                map.put("n"+i+""+j,new GNode(i,j,inputMatrix[i][j]));
            }
        }

        map.get("n00").connections.add(map.get("n01"));
        map.get("n00").connections.add(map.get("n10"));

        map.get("n01").connections.add(map.get("00"));

        System.out.println(map);

    }

    public static class GNode{
        int x;
        int y;
        boolean visited = false;
        int data;
        List<GNode> connections = new ArrayList<GNode>();

        public String toString(){
            return "{x="+x+",y="+y+",data="+data+",connections="+connections+"}";
        }

        public GNode(int x, int y, int data){
            this.x = x;
            this.y = y;
            this.data = data;
        }

    }


}
