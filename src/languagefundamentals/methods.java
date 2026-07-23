package languagefundamentals;
import java.util.Scanner; 


public class methods {
	  String studentname;
	  int rollnumber;
	  int marks ;
	  int numbsubject;
	  int mark1, mark2,mark3, mark4;
	  
	  int total;
	  double Average;
	  double percentage;
	  String gread;
	  boolean ispass;
	  
	  void getstudentdelails(Scanner sc ) {
		  System.out.println("Enter the student name: ");
		  studentname=sc.next();
		  
		 System.out.println("enter thr student rollnumber:");
		int  studentrollnumber=sc.nextInt();
		
		System.out.println("Enter the student marks:");
		int studentmarks = sc.nextInt();
		
		System.out.println("Enter the numsubject:");
		int numsubject = sc.nextInt();
		
		System.out.println("enter the subject1 marks");
		int subject1= sc.nextInt();
	
		System.out.println("enter the subject2 marks");
		int subject2= sc.nextInt();
		
		System.out.println("enter the subject3 marks");
		int subject3= sc.nextInt();
		
		System.out.println("enter the subject4 marks");
		int subject4=  sc.nextInt();
	  }
		
	  
		void calculatetotal(int t1, int m2, int s3, int b4) {
			total = t1 + m2 + s3 + b4;
			System.out.println("total marks:=" + total);
		
	}
		void calculateaverage(int t1, int m2, int s3, int b4) {
			Average = t1+m2+s3+b4;
			System.out.println("average marks:=" + total);
		}
		 
		void calculatepercentage(int t1, int m2, int s3, int b4) {
 

		}
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    methods obj = new methods();

		    obj. getstudentdelails(sc);
		    obj.calculatetotal(obj.mark1, obj.mark2, obj.mark3, obj.mark4);
		    obj.calculateaverage(obj.mark1, obj.mark2, obj.mark3, obj.mark4);
		    obj.calculatepercentage(obj.mark1, obj.mark2, obj.mark3, obj.mark4);

	}

}
