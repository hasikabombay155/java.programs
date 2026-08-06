package com.loopstatments;
import java.util.Scanner;

public class testdemoLP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		for (int i = 1; i <= 30; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		for (int i = 1; i <= 40; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
		
		
		

		sc.close();
	}
}