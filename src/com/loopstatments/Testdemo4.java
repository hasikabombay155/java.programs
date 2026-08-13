package com.loopstatments;
import java.util.Scanner;

public class Testdemo4 {
	static boolean isprime(int n ) {
		boolean status = true;
		
		if (n == 0 || n == 1 ) {
			return false;
		}
		for (int i = 2; i<= n / 2; i++) {
			if(n % i == 0 ) {
				status = false;
				break;
			}
		}
		return status;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
			int n = sc.nextInt();
			
			boolean status = isprime(n);
			
			if(status) {
				System.out.println("The given number is prime ! ");
			}else {
				System.out.println("The given number is not a prime !");
			}

	}

}
