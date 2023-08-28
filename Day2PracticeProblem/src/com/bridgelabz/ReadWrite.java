package com.bridgelabz;
import java.util.Scanner;

//Read a single Digit Number and write in word.
public class ReadWrite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        System.out.print("Enter a 3 digit number:");
        int number = input.nextInt();

        hundreds = number / 100;
        System.out.printf("Hundreds place digit: " , hundreds);

        tens = (number - hundreds) / 10;
        System.out.printf("\nTens place digit: " , tens);


        ones = (number - tens - hundreds);
        System.out.printf("\nOnes place digit: " , ones);


        if (number > 999);
        System.out.println("\nError! Number more then 3 digits.");
        if (number < 100);
        System.out.println("Error! Number less then 3 digits.");
    }

}
