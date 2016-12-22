package com.ritvik;

import java.text.DecimalFormat;

/**
 * Created by u6023478 on 5/13/2016.
 */
public class Foo implements Comparable<Foo> {
    public int val;

    public Foo(int val) {
        this.val = val;
    }

    public Foo() {
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.000");
        Double foo = 3.12995;

        System.out.println(String.format( "%.3f", foo ));

    }

    @Override
    public int compareTo(Foo o) {
        return compare(o.val, this.val);
    }

    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
