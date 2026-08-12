package com.loopstatments;
import java.util.Scanner;

public class testLP02 {

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");

		int n = sc.nextInt();
		long result = fact(n);
		System.out.println("factorial of given number is : " + result);
	}

	static long fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
		
	}

}