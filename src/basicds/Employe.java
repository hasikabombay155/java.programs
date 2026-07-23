package basicds;

public class Employe {
 
protected void  finalize()throws Throwable {
	System.out.println("garbage collaction is called ");
	}

	public static void main(String[] args) {
		
		Employe E1 = new Employe();
		Employe E3 = new Employe();
		System.out.println(E3);
		System.out.println(E1);
		E3=E1;
		E1 = null ;
		System.out.println(E1);
		System.out.println("garbage collection nullification ");
		System.gc();
		
		Employe E2 = new Employe();
		Employe E4 = new Employe();
		System.out.println(E4);
		E2=E4;
		System.out.println(E2);
		System.out.println(E2);
		System.out.println("Employe E2 = new Employe();s ");
		System.gc();
		

	}

}
