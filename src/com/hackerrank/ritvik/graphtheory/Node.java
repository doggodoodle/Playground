package com.hackerrank.ritvik.graphtheory;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by u6023478 on 12/12/2016.
 */
public class Node {
    public int value;
    public Set<Node> connections = new HashSet<>();

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for(Node n: connections){
            sb.append(n.value+ " ");
        }
        return "Node{" +
                "value=" + value +
                ", connections=" + sb.toString() +
                ", visited=" + visited +
                '}';
    }

    public void addNeighbor(Node n){
        connections.add(n);
        n.connections.add(this);
    }

    public boolean visited = false;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return value == node.value;

    }

    @Override
    public int hashCode() {
        return value;
    }
}
