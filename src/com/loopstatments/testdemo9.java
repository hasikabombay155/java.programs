package com.loopstatments;
import java.util.Scanner;
public class testdemo9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 0;
        int temp = num;

        if (temp < 0) {
            temp = -temp;
        }

        while (temp != 0) {
            int digit = temp % 10;   
            if (digit > largest) {
                largest = digit;
            }
            temp = temp / 10;       
        }

        System.out.println("Largest Digit = " + largest);
        sc.close();
    }
}