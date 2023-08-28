package com.bridgelabz;
//Write a program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance
// from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
public class DistanceJava {
    public static void main(String arg[])
    {
        int x1,x2,y1,y2;
        double dis;
        x1=1;y1=1;x2=4;y2=4;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance-between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
