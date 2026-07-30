package com.logicalstatement;
import java.util.Scanner;

public class Agecheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		
		String adultstatus = (age >= 18) ? "adult" : "minor";
		System.out.println("Status: " + adultstatus);
		
		String category = (age <= 13) ? "child"
				        : (age <= 18) ? "Teen"
				        : "Adult"	;
		System.out.println("category : " + category);
		 
		String votingstatus = (age >= 18) ? "Eligible for vote " : " Not Eligible for vote" ;
		System.out.println("voting : " + votingstatus);
		
		String seniorstatus = (age >= 60 ) ? "senior citizon " : " Not senior citizon" ;
		System.out.println("senior : " + seniorstatus);
		
		String licenseStatus = (age >= 18) ? " Eligible for license " : "Not Eligible for license"  ;
		System.out.println("license : " +  licenseStatus);
		sc.close();
				

	}

}
