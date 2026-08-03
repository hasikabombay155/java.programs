package com.logicalstatement;
import java.util.Scanner;
public class movieticketsbooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("select ticket type : ");
			System.out.println("1. silver - Rs. 200");
			System.out.println("2. gold - Rs. 300");
			System.out.println("3. platinum - Rs. 500");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			if (choice == 4 ) {
			System.out.println("Thank you for visting: ");
			break;
	 	}
		
		switch(choice) {
		case 1 : 
			System.out.println("Enter your age:" );
			int age1 = sc.nextInt();
			double silverprice = 200;
			if (age1 >= 60 ) {
				silverprice = silverprice - (silverprice * 10 / 100);
			}
		System.out.println("Your ticket price is: " + silverprice);
		break;
		
		case 2 :
			System.out.println("Enter your age : ");
			int age2 = sc.nextInt();
			double goldprice = 300;
			if (age2 >= 60 ) {
				goldprice = goldprice - (goldprice * 10 / 100 );
			}
				System.out.println(" your ticket price is : " + goldprice);
				break;
				
				case 3 : 
					System.out.println("Enter you age : ");
					int age3 = sc.nextInt();
					double platinumprice = 500;
					if (age3 >= 60 ) {
						platinumprice = platinumprice - (platinumprice * 10 / 100);
					}
					System.out.println(" your ticket price is : " + platinumprice);
					break;
				case 4 : 
					System.out.println("");
					default :
						System.out.println(" invaild choice ! try agin");
		}
						
					} while (choice != 4);
			sc.close();
					
	}
		

	}


