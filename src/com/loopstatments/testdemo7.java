package com.loopstatments;

import java.util.Scanner;

public class testdemo7 {

    // WAP to print sum of the digits of a given number
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int r = n % 10;  
            n = n / 10;       
            sum = sum + r;    
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Main method started!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Sum of all the digits of the given number is: " + sum);

        sc.close();
    }
}