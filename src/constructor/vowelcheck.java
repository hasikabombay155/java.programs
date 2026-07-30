package constructor;
import java.util.Scanner;

public class vowelcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);

		char lowerch = Character.toLowerCase(ch);
		String result = (lowerch == 'a') || (lowerch == 'e') || (lowerch == 'i')
				|| (lowerch == 'o') || (lowerch == 'u')
				? "vowel"
				: "consonant";

		System.out.println(result);

		sc.close();
	}
}