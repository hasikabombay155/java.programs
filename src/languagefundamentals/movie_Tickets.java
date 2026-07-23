package languagefundamentals;

public class movie_Tickets {
	int Ticket_Id = 1001;
	int Screen_Number = 5;
	int Ticket_price = 500;
	boolean Online_Booking_status=true;
	int Viewer_Age = 20;
	int Number_of_Tickets = 10;
	long Contact_number =9848166498l;
	int  GST_amount = 45;
	

	

	public static void main(String[] args) {
		movie_Tickets E1 = new movie_Tickets();
		System.out.println("------------------------------------------------------");
		System.out.println("Ticket_Id="+ E1.Ticket_Id );
		System.out.println("Screen_Number="+E1.Screen_Number);
		System.out.println("Ticket_price="+E1.Ticket_price);
		System.out.println("Online_Booking_status="+E1.Online_Booking_status);
		System.out.println("Viewer_Age="+E1.Viewer_Age);
		System.out.println("Number_of_Tickets="+E1.Number_of_Tickets);
		System.out.println("Contact_number="+E1.Contact_number);
		System.out.println("GST_amount="+E1.GST_amount);

		

	}

}
