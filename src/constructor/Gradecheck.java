package constructor;
import java.util.Scanner;


public class Gradecheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		
		int  marks = sc.nextInt();
		String result = (marks >= 40) ? "pass" : "fail" ; 
		System.out.println("result : " + result);
		
		char grade = (marks >= 90) ? 'A' 
		           : (marks >= 70) ? 'B'
		           :(marks >= 60) ? 'C'
		           : (marks >= 40) ? 'D'
		           : 'F' ;
		
		System.out.println("Grade:"+ grade);
		String scholarship = (marks >= 90) ? "Eligible for scholarship" : "not eligible for scholarship";
		System.out.println(scholarship);
		
		

	}

}
