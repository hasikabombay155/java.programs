package languagefundamentals;

import java.util.Scanner;

public class Calculator_operation {
	static void add(double a , double b) {
   System.out.println("Addition="+ (a+b));
    
}
	static void sub(double a, double b) {
		System.out.println("substaction="+ (a-b));
	}
	static void multy(double a, double b) {
		System.out.println("multiplation="+(a*b));
	}
	static void divid(double a , double b) {
		System.out.println("divition="+(a/b));
	}
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter first number");
	double num1 = sc.nextDouble();
  
	System.out.println("Enter second number");
	double num2 = sc.nextDouble();
	add(num1,num2);
	sub(num1,num2);
	multy(num1,num2);
	divid(num1,num2);
	
	
}

}