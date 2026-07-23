package languagefundamentals;
import java.util.Scanner;

public class methods2 {

    void getname(String fname, String Lname) {
        System.out.println("Employee full name: " + fname + " " + Lname);
    }

    void getage(int age) {
        System.out.println("Employee age: " + age);
    }

    void salaryinfo(double salary) {
        System.out.println("Employee salary: " + salary);
    }

    void getheight(double heigh) {
        System.out.println("Employee height: " + heigh);
    }

    void getweight(double weight) {
        System.out.println("Employee weight: " + weight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methods2 m = new methods2();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear leftover newline
        m.getage(age);

        System.out.println("Enter your first name: ");
        String firstname = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastname = sc.nextLine();
        m.getname(firstname, lastname);

        System.out.println("Enter your weight: ");
        double weight = sc.nextDouble();
        m.getweight(weight);

        System.out.println("Enter your height: ");
        double heigh = sc.nextDouble();
        m.getheight(heigh);

      
    }
}