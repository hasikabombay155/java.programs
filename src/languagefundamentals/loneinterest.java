package languagefundamentals;
import java.util.Scanner;
public class loneinterest {
	 double calculateintrest(double principal,double rate, int time ) {
		return (principal * rate * time);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the principal amount :");
		double principal = sc.nextDouble();
		
		System.out.println("enter the rate of the interest:");
		double rate = sc.nextDouble();
		
		System.out.println("enter the time (in years)");
		int time = sc.nextInt();
		
		
	
	}

}