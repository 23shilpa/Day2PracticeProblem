package com.bridgelabz;
//Enter two numbers and do the following arithmetic Operations find max and min.
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + a * b);
        System.out.println("a/b=" + a / b);
        System.out.println("b%a=" + a % b);
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a,b));
    }
}

