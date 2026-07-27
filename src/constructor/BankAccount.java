package constructor;

public class BankAccount {
	String Accountholder;
	int Accountnumber;
	double Balance;
	
	 public BankAccount() {
	        this("Unknown");
	    }
	 public BankAccount(String Accountholder) {
		 this(Accountholder,0);
	 }
	 public BankAccount(String Accountholder, int Accountnumber) {
		 this(Accountholder,Accountnumber, 0.0);
	 }
	 public BankAccount(String Accountholder, int Accountnumber, double Balance) {
		this.Accountholder=Accountholder;
		this.Accountnumber=Accountnumber;
		this.Balance=Balance;
		
	 }
	 public void display() {
		 System.out.println("Accountholder:"+Accountholder);
		 System.out.println("Accountnumber:"+Accountnumber);
		 System.out.println("Balance:"+Balance);
	 }

	public static void main (String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Hasika");
		BankAccount acc3 = new BankAccount("Hasika",1234567890);
		BankAccount acc4 = new BankAccount("Hasika",1234567890, 50000);
		
		acc1.display();
		acc2.display();
		acc3.display();
		acc4.display();
		

	}

}
