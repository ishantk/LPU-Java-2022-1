
class Customer{
	int cid;
	String name;
	
	// protected method from Object class which can be used as a destructor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Customer Object Deleted: "+cid+" "+name);
	}
}

public class JavaRuntime {

	public static void main(String[] args) {
		
		// Get the reference to the Runtime Object
		Runtime rt = Runtime.getRuntime();
		
		Customer c1 = new Customer();
		c1.cid = 101;
		c1.name = "John";
		
		Customer c2 = new Customer();
		c2.cid = 201;
		c2.name = "Fionna";
		
		System.out.println("availableProcessors: "+rt.availableProcessors());
		System.out.println("totalMemory: "+rt.totalMemory());
		System.out.println("freeMemory: "+rt.freeMemory());
		System.out.println("maxMemory: "+rt.maxMemory());
		
		c1 = null;
		c2 = null;
		
		// Execute the GC using Runtime also
		rt.gc();
		// thereafter check the memory flow 
		
		System.out.println("totalMemory: "+rt.totalMemory());
		System.out.println("freeMemory: "+rt.freeMemory()); // this memory increases after GC
		System.out.println("maxMemory: "+rt.maxMemory());
		

	}

}
