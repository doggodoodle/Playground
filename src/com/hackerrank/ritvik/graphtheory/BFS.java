package com.hackerrank.ritvik.graphtheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by u6023478 on 12/12/2016.
 *
 * BFS = 0 1 3 8 7 2 4 5 6
 */
public class BFS {

    public static void main(String[] args) {
        List<Node> graph = new ArrayList<>(9);
        for(int i = 0; i <=8; i++){
            Node n = new Node(i);
            graph.add(i,n);
        }

        graph.get(0).addNeighbor(graph.get(1));
        graph.get(0).addNeighbor(graph.get(3));
        graph.get(0).addNeighbor(graph.get(8));
        graph.get(1).addNeighbor(graph.get(7));
        graph.get(7).addNeighbor(graph.get(2));
        graph.get(3).addNeighbor(graph.get(2));
        graph.get(4).addNeighbor(graph.get(3));
        graph.get(4).addNeighbor(graph.get(8));
        graph.get(2).addNeighbor(graph.get(5));
        graph.get(5).addNeighbor(graph.get(6));


        for(Node n : graph){
            //System.out.println(n);
        }

        //bfs(graph.get(0));

        traverse(null,graph.get(0),graph.get(1),graph.get(3),0);


    }

    static Integer traverse(Node prev, Node origin, Node curr, Node dest, int sum){
        sum = sum +6;

        if(dest.equals(curr)) {
            System.out.println("Sum=" + sum);
            return sum;
        }
        if(origin.equals(curr)){
            System.out.println("reached origin");
            return null;
        }
        List<Node> neighs = new ArrayList<>();
        for(Node n: curr.connections){
            if( !n.equals(prev))
                neighs.add(n);
        }
        if (neighs.isEmpty()){
            System.out.println("Deadend "+curr);
            return null;
        }
        for(Node node : neighs){
            return traverse(curr,origin,node,dest,sum);
        }

        return null;

    }

    static void bfs(Node head){




    }


}
