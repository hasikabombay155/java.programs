package com.loopstatments;
import java.util.Scanner;

public class TestdemoLP3 {

	public static void main(String[] args) {
		System.out.println("main method started:");
		Scanner sc = new Scanner(System.in);
		System.out.println("up to where tou want to print .. ?");
		
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
		    if (isprime(i)) {
		        System.out.println(i + " ");
		    }
		}
	}
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
}