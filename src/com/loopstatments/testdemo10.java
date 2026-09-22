package com.loopstatments;
import java.util.Scanner;
public class testdemo10 {
	static boolean isPalindrome(int n) {
		int temp = n;
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev == temp;
	}
	public static void main(String[] args) {
		System.out.println("main method started:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		boolean status = isPalindrome(n);

		if (status) {
			System.out.println("The number is palindrome :");
		} else {
			System.out.println("The number is not palindrome :");
		}
	}
}