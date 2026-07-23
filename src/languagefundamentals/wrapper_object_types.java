package languagefundamentals;

public class wrapper_object_types {
	Integer product_id = 1001;
	String product_Name = "Hasika";
	Integer product_Price = 2999;
	Integer product_Rating = 5;
	boolean product_Availablestatus = true;
	Integer product_Stockquantity =100;
	Integer product_Discountpercentage = 10;
	char product_code = 'A';
	
	public static void main(String[] args) {
		wrapper_object_types  E1 = new wrapper_object_types();
		
		System.out.println("-------------------------------product Detials-----------------------------");
		
		System.out.println("product_id="+ E1.product_id);
		System.out.println("product_Name="+ E1.product_Name);
		System.out.println("product_Price="+ E1.product_Price);
		System.out.println("product_Rating="+ E1.product_Rating);
		System.out.println("product_Availablestatus="+ E1.product_Availablestatus);
		System.out.println("product_Stockquantity="+ E1. product_Stockquantity);
		System.out.println("product_Discountpercentage="+ E1. product_Discountpercentage);
		System.out.println("product_code="+ E1. product_code);
		

	}

}
