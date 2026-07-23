package languagefundamentals;
import java.util.Scanner;

public class Salaryslipgenerator {
	void salaryslip(String employeename,double basicsalary) {
		double hra = basicsalary*20/100;
		double da = basicsalary*10/100;
		double grosssalary = basicsalary+hra+da;
		
		System.out.println("employeename:"+ employeename);
		System.out.println("basicsalary:" + basicsalary);
		System.out.println("hra 20%:"+ hra/100);
		System.out.println("da 10%:"+da/100);
		System.out.println("grossalary:"+ grosssalary);
		
	
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the employeename");
	String employeename = sc.nextLine();
	
	System.out.println("Enter the basicsalary");
	double basicsalary = sc.nextDouble();
	
	System.out.println("Enter the hra ");
	double hra = sc.nextDouble();
	
	System.out.println("Enter the da ");
	double da = sc.nextDouble();
	
	System.out.println("Enter the grossalary");
	double grossalary = sc.nextDouble();
	
	
	Salaryslipgenerator s = new Salaryslipgenerator();
	s.salaryslip( employeename, basicsalary);

	}

}
