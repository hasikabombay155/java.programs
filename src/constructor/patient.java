package constructor;
import java.util.Scanner;

public class patient {
	
	String patientname;
	int  age ;
	int roomchargeperday;
	double numberofdaysadmitted;
	
	patient( String patientname, int age, int roomchargeperday, double numberofdaysadmitted){
		this.patientname=patientname;
		this.age=age;
		this.roomchargeperday=roomchargeperday;
		this.numberofdaysadmitted = numberofdaysadmitted;
	}
	void calculatebills() {
		double totalbills =  roomchargeperday * numberofdaysadmitted;
		System.out.println("patientname:"+patientname);
		System.out.println("age:"+age);
		System.out.println("roomchargeperday:"+roomchargeperday);
		System.out.println("numberofdaysadmitted:"+numberofdaysadmitted);
		System.out.println("totalbills:"+totalbills);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the patientname:");
		String patientname = sc.nextLine();
		
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		
		
		System.out.println("Enter the roomchargeperday:");
		int roomchargeperday = sc.nextInt();
		
		System.out.println("Enter the numberofdaysadmitted :");
		double numberofdaysadmitted = sc.nextDouble();
		

		
		patient p = new patient( patientname, age,  roomchargeperday,  numberofdaysadmitted);
		p.calculatebills();
		
		
	}

}
