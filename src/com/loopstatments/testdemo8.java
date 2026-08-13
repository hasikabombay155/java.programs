package com.loopstatments;
import java.util.Scanner;
public class testdemo8 {

    // WAP to print the reverse of a given number
    static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int r = n % 10;              
            n = n / 10;                  
            reverse = reverse * 10 + r;  
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Main method started!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int reverse = reverseNumber(n);
        System.out.println("Reverse of the given number is: " + reverse);
        sc.close();
    }
}