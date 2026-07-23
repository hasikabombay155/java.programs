package info.java;

public class task6 {
@Override
protected void finalize() throws Throwable {  
	super.finalize();
}

	public static void main(String[] args) {
		task6 hp = new task6();
		System.out.println(hp);
		
		task6 Dell = new task6();
		System.out.println(Dell);
		
		task6 len = new task6();
		System.out.println(len);
		
		hp = null;
		
		
		System.gc();
		System.out.println(hp);
		System.out.println(Dell);
		System.out.println(len);
		
		

	}

}
