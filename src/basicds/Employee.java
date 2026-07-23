package basicds;

public class Employee {
	static String companyName;
	static String location;
	 String employeeName;
	 String salary;
	 static {
		 companyName = ( "Amazon ");
		  location = (" hyd");
		 
		 	 }
	public static void main(String[] args) {
		Employee E1 = new Employee();
        E1.employeeName = "Hasika";
        E1.salary = "5000000";
        System.out.println( " --------Employee1---------");
        System.out.println("companyName :" + companyName);
        System.out.println("Location : "+ location );
        System.out.println("employeeName:"+ E1.employeeName);
        System.out.println("salary : " +E1.employeeName );
        
        
       System.out.println("-----------------------------------------");
       
       
       
       
       
        Employee E2 = new Employee();
        E2.employeeName = "Kavari";
        E2.salary = "5000000";
        System.out.println( "----Employee2---------");
        System.out.println("companyName :" + companyName);
        System.out.println("Location : "+ E2.location);
        System.out.println("employeename :"+ E2.employeeName );
        System.out.println("salary :" + E2.salary );
        
        
        
        
        
        System.out.println("-----------------------------------------");
        
        
        
        
        Employee E3 = new Employee();
        E3.employeeName = "Bhavya";
        E3.salary = "5000000";
        System.out.println( "----Employee3---------");
        System.out.println("companyName :" + companyName);
        System.out.println("Location : "+ E3.location);
        System.out.println("employeename :"+ E3.employeeName );
        System.out.println("salary :" + E3.salary );
        
        
        
        System.out.println("-----------------------------------------");
        
        
        
        Employee E4 = new Employee();
        E4.employeeName = "Bhavya";
        E4.salary = "5000000";
        System.out.println( "----Employee4---------");
        System.out.println("companyName :" + companyName);
        System.out.println("Location : "+ E4.location);
        System.out.println("employeename :"+ E4.employeeName );
        System.out.println("salary :" + E4.salary );
        
		
		// TODO Auto-generated method stub

	}

}
