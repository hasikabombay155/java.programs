package basicds;

public class programm {
	
	 static programm obj = new programm ();

	public static void main(String[] args) {
		System.out.println("Main method started");
	
	}
	static {
		System.out.println("static block loaded ");
		
	}
	public programm() {
		// TODO Auto-generated constructor stub
	}
	{
		System.out.println("instance block loaded ");
		
		// TODO Auto-generated method stub

	}

}
