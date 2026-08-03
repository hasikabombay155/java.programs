package com.logicalstatement;
import java.util.Scanner;

public class Digitlcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the intiger : ");
		int num = sc.nextInt();
		
		int n = Math.abs(num);
		
		if (n >= 10 && n <= 99 ){
			System.out.println("two digits numbers");
		} else if (n >= 99 && n <= 999) {
			System.out.println("three digits numbers");
		} else if (n > 999) {
		System.out.println("more than three digitis");
		}else {
			System.out.println("less than two digits");
		}
		sc.close();
	}

}
