package constructor;
import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		String result = (num>=0) ? "positive":"negative";
		System.out.println("the result:"+result);
	}

}
