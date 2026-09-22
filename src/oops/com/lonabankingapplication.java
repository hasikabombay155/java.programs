package oops.com;
import java.util.Scanner;

public class lonabankingapplication {
	static Scanner sc = new Scanner(System.in);

	boolean isphonevalid() {
		System.out.println("Enter your mobile number");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	boolean isAadharvalid() {
		System.out.println("Enter your Aadhar ");
		String aadhar = sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}

	boolean ispanvalid() {
		System.out.println("Enter your pan ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	int getcibilscore() {
		System.out.println("Enter your cibil score");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getcustomerSalary() {
		System.out.println("Enter your salary ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getcustomerAge() {
		System.out.println("Enter your Age ");
		int age = sc.nextInt();
		return age;
	}

	double getloneROI() {
		double roi = 8.5;
		int cibil = getcibilscore();
		if (cibil >= 300 && cibil <= 549) {
			System.out.println("poor-high risk; loan application are likely to be rejected or approved at high interest rates");
			roi = roi + 4.0;
		} else if (cibil >= 550 && cibil <= 699) {
			System.out.println("fair-moderate risk; may face limitation in credit approval ");
			roi = roi + 2.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good - low risk; better chances of loan approval with favorable terms");
			roi = roi + 1.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("Excellent - very low risk; highest likelihood of approval and access to lower interest rates");
			roi = roi + 0.5;
		} else {
			System.out.println("Invalid cibil information !! can you connect with relationship manager of your bank");
			roi = roi + 10.0;
		}
		return roi;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Hasika's personal loan Banking !! ");

		lonabankingapplication P1 = new lonabankingapplication();
		double salary = P1.getcustomerSalary();
		int age = P1.getcustomerAge();

		if (salary >= 90000.00 && age >= 26) {
			System.out.println("Basic information is validated check personal details ");
			if (P1.isphonevalid() && P1.isAadharvalid() && P1.ispanvalid()) {
				System.out.println("Details are good and loan get approved !! ");
				System.out.println("your loan ROI is " + P1.getloneROI());
			} else {
				System.out.println("something went wrong ");
			}
		} else {
			System.out.println("you are not eligible for personal loan and your loan got rejected");
		}
		System.out.println("main method ended ");
	}
}