package constructor;
import java.util.Scanner;


public class gradecalculator {

	public static void main(String[] args) {
int marks = 82;

String grade = (marks >= 90) ? "A"
                       : (marks >= 75) ? "B"
                       : (marks >= 60) ? "C"
                       : (marks >= 40) ? "D"
                       : "fail";
                       
        System.out.println("marks:"+marks + " > grade:" + grade);

	}

}
