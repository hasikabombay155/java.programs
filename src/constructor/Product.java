package constructor;
import java.util.Scanner;
public class Product {
int productid;
String productName;
double price;

public Product(int productid, String productName, double price) {

	this.productid = productid;
	this.productName = productName;
	this.price = price;
}
	
        public void displayDetails() {
		System.out.println("productid:"+ productid);
		System.out.println("productName:" + productName);
		System.out.println("price:"+ price);
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the productid");
		  int Producid = sc.nextInt();
		  System.out.println("Enter the productName");
		  String ProducName = sc.nextLine();
		  System.out.println("Enter thr price");
		  double price = sc.nextDouble();
		  
	        
		
		  
		  
	}

}
