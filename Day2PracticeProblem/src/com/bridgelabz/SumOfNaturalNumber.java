package com.bridgelabz;

import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class SumOfNaturalNumber {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number n: ");
         int num = scanner.nextInt();
         int i = 0,sum = 0;
         while (i<= num) {

             sum = sum + i;

             i++;
         }


         System.out.println("Sum Of n Natural Numbers is= " + sum);
     }
}
