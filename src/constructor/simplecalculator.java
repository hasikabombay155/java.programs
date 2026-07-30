package constructor;
import java.util.Scanner;

public class simplecalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		double num1= sc.nextInt();
		System.out.println("Enter the second number ");
		double num2= sc.nextDouble();	
		System.out.println("Enter the operator");
		char operator = sc.next().charAt(0);
		
		double result = (operator == '+') ? (num1 + num2) : (num1-num2);
		
		System.out.println("result:"+ result);
		
		sc.close();
		
		

	}

}
