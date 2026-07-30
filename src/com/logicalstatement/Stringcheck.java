package com.logicalstatement;
import java.util.Scanner;

public class Stringcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character : ");
		char ch = sc.next().charAt(0);
		char lowerch = Character.toLowerCase(ch);
		String vowelcheck = (lowerch == 'a') || (lowerch == 'e') || (lowerch == 'i') || (lowerch == 'o') || (lowerch == 'u')
		                   ? "Vowel" : "Consonant";
		System.out.println("result : " + vowelcheck);

		System.out.print("Enter a letter : ");
		char letter = sc.next().charAt(0);
		String caseCheck = Character.isUpperCase(letter) ? "Uppercase" : "Lowercase";
		System.out.println("Result : " + caseCheck);

		sc.nextLine();
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		String emptyCheck = (str.isEmpty()) ? "Empty string" : "Not empty";
		System.out.println("Result : " + emptyCheck);

		System.out.print("Enter a word : ");
		String word = sc.nextLine();
		String reversed = new StringBuilder(word).reverse().toString();
		String palindromeCheck = (word.equals(reversed)) ? "Palindrome" : "Not a palindrome";
		System.out.println("Result : " + palindromeCheck);

		sc.close();
	}
}