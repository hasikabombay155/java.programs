package com.logicalstatement;
import java.util.Scanner;

public class Foodorderbilling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double total = 0;
		do {
			System.out.println("--------welcome to Vaha's diner");
			System.out.println("1.Biryani - Rs.250");
			System.out.println("2.panner Biryani - Rs.300");
			System.out.println("3.Burger - Rs.199");
			System.out.println("4.pizza - Rs.150");
			System.out.println("5.Veg pizza - Rs.170");
			System.out.println("6.cold drink - Rs.199");
			System.out.println("7.Pasta - Rs.110");
			System.out.println("8.Water - Rs.50");
			System.out.println("9.Tea - Rs.30");
			System.out.println("10.Ice cream - Rs.50");
			System.out.println("11.Exit");
			System.out.println("enter your choice :");
			choice = sc.nextInt();

			if (choice == 11) {
				System.out.println("Thank you for ordering");
				break;
			}

			int qty;
			switch (choice) {
			case 1:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				double Briyanprice = 250 * qty;
				total = total + Briyanprice;
				System.out.println("Added " + qty + " Briyanprice(s): Rs. " + Briyanprice);
				break;

			case 2:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				double pannerBiryaniprice = 300 * qty;
				total = total + pannerBiryaniprice;
				System.out.println("Added " + qty + " pannerBiryaniprice(s) : Rs." + pannerBiryaniprice);
				break;

			case 3:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double Burgerprice = 199 * qty;
				total = total + Burgerprice;
				System.out.println("Added " + qty + " Burgerprice(s) : Rs. " + Burgerprice);
				break;

			case 4:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double pizzaprice = 150 * qty;
				total = total + pizzaprice;
				System.out.println("Added " + qty + " pizzaprice(s) : Rs." + pizzaprice);
				break;

			case 5:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double Vegpizzaprice = 170 * qty;
				total = total + Vegpizzaprice;
				System.out.println("Added " + qty + " Vegpizzaprice(s) : Rs." + Vegpizzaprice);
				break;

			case 6:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				double colddrinkprice = 199 * qty;
				total = total + colddrinkprice;
				System.out.println("Added " + qty + " colddrinkprice(s): Rs." + colddrinkprice);
				break;

			case 7:
				System.out.println("Enter quantity");
				qty = sc.nextInt();
				double Pastaprice = 110 * qty;
				total = total + Pastaprice;
				System.out.println("Added " + qty + " Pastaprice(s): Rs." + Pastaprice);
				break;

			case 8:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double Waterprice = 50 * qty;
				total = total + Waterprice;
				System.out.println("Added " + qty + " Waterprice: Rs." + Waterprice);
				break;

			case 9:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double Teaprice = 30 * qty;
				total = total + Teaprice;
				System.out.println("Added " + qty + " Teaprice: Rs." + Teaprice);
				break;

			case 10:
				System.out.println("Enter quantity ");
				qty = sc.nextInt();
				double Icecreamprice = 50 * qty;
				total = total + Icecreamprice;
				System.out.println("Added " + qty + " Icecreamprice: Rs." + Icecreamprice);
				break;

			default:
				System.out.println("Invalid choice! Try again");
			}

			System.out.println("Current total: Rs. " + total);

		} while (choice != 11);

		System.out.println("Your final bill is: Rs. " + total);

		if (total > 500) {
			double discount = total * 10 / 100;
			System.out.println("You got a 10% discount: Rs. " + discount);
			System.out.println("Final payable amount: Rs. " + (total - discount));
		}

		sc.close();
	}
}