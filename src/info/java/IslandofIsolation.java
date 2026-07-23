package info.java;
class A{
	 B b;
	 
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called A ");
	}
	
	class B{
		A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called B ");
	  }
	}
}

public class IslandofIsolation {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		A obj1 = new A();
		A.B obj2 = obj1.new B();
		
		obj1.b = obj2;
		obj2.a = obj1; 
		
		obj1 = null;
		obj2 = null;
		
		System.gc();
		System.out.println("main method ended");
		
	}
}
         
