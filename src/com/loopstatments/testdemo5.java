package com.loopstatments;
import java.util.Scanner;
public class testdemo5 {
// WAP to print sum of the digits of a given number?
	static int sumofdigits(int n ) {
		int sum = 0;
		int r = 0;
		while (n > 0 ) {
			r = n % 10;
			n = n / 10;
			r = n % 20;
			n = n / 20;
			sum =sum + r;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method startrd !! ");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		int sum = sumofdigits(n);
		System.out.println("sum of all the digits from given number is : " +sum);
	}

}
