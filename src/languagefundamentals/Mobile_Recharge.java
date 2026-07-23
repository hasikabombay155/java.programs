package languagefundamentals;

public class Mobile_Recharge {
    int  plan_name  = 999;
	int Validity = 28;
	float Data = 1.5f ;
	int   calls = 999;
	double amount = 999;
	
	
	  void showPlanDetails() {
		System.out.println("current recharge plan");
		System.out.println("plan_name = "+ plan_name);
		System.out.println("Validity= "+ Validity);
		System.out.println("Data = "+ Data );
	    System.out.println("calls ="+ calls) ;
	  }

		public 	static void main (String[] args) {
			 Mobile_Recharge t1 = new Mobile_Recharge();
		        t1.showPlanDetails();
	    
	 
	}

	}


