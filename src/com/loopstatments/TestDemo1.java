package com.loopstatments;
import java.util.Scanner;

public class TestDemo1 {

	static void main(String[] args) {

		System.out.println("main method started :");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();

		int n1 = findfactorial(n);
		System.out.println("factorial of given number is :" + n1);

	}

	static int findfactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}