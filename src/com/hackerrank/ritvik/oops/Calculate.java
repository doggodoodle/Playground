package com.hackerrank.ritvik.oops;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by u6023478 on 10/3/2016.
 */
public class Calculate {
    Scanner sc = new Scanner(System.in);
    public int get_int_val() throws IOException, NumberFormatException{
        int i = sc.nextInt();
        if(i<=0)
            throw new NumberFormatException("All the values must be positive");
        return i;
    }
    public double get_double_val() throws IOException, NumberFormatException{

        double i = sc.nextDouble();
        if(i<=0)
            throw new NumberFormatException("All the values must be positive");
        return i;
    }

    public static Calculate do_calc(){
        return new Calculate();
    }

    public Calculate output = this;


    public void display(Double volume){
        System.out.println(String.format( "%.3f", volume ));
    }

    public double get_volume(int a){
        return a*a*a;
    }

    public double get_volume(int l, int b, int h){
        return l*b*h;
    }

    public double get_volume(double r){
        double vol = 2d/3d*Math.PI * r * r * r;
        System.out.println("hemi vol  = "+vol);
        return vol;
    }

    public double get_volume(double r, double h){
        return Math.PI * r * r *h;
    }
}
