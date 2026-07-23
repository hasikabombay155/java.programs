package languagefundamentals;

import java.util.Scanner;

public class Studentresult {
	void displaystudent(String name) {
		System.out.println("Student name = "+ name );
	}
	void calulateTotal( int m1, int m2, int m3, int m4, int m5  ) {
	int total = m1=m2+m3+m4+m4+m5;
	System.out.println("Total marks:" + total);
}
	void calculateAverage(int m1,int m2, int m3, int m4 , int m5) {
		double total = m1+m2+m3+m4+m5;
		System.out.println("Average marks :" + total);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student name ");
		String name = sc.nextLine();
		
		System.out.println("Enter marks from subject1: ");
		int m1= sc.nextInt();
		System.out.println("Enter marks from subject2: ");
		int m2= sc.nextInt();
		System.out.println("Enter marks from subject3: ");
		int m3 =sc.nextInt();
		System.out.println("Enter marks from subject4:");
		int m4 = sc.nextInt();
		System.out.println("Enter marks from sunject 5:");
		int m5 = sc.nextInt();
		
		
		Studentresult obj = new Studentresult();
		obj.displaystudent(name);
		obj.calulateTotal(m1,m2 ,m3,m4,m5);
		obj.calculateAverage(m1,m2,m3,m4,m5);
		
		
		
		
		
		
		
	}

}
