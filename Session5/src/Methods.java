
public class Methods {
	
	
	// Function inside a class is called as Method :)
	// Methods can be of 2 types
	// 1. non static => is executed with reference variable
	// 2. static  => executed with class name
	

	// return type -> any data type i.e. primitive or reference
	//				  all in all only 1 single return can be done
	//				  return marks the end of the method
	
	// name -> any meaningful name
	//		   java follows camel case -> method name should be something like:
	//		   startsLowerAndThanGoesUpper
	
	// Arguments or Input List -> Multiple Inputs/Args as per our requirement
	
	// Definition => What method will do, piece of logic goes here
	
	// Execution -> from the main or any other method -> alongwith static/non static conventions
	
	/*int f(int x, int y) {
		//int z = x*x + y*y + 2*x*y;
		//return z;
		
		return (x*x + y*y + 2*x*y);
	}*/
	
	static int f(int x, int y) {
		//int z = x*x + y*y + 2*x*y;
		//return z;
		
		return (x*x + y*y + 2*x*y);
	}
	
	public static void main(String[] args) {
		
		// method:
		// f(x, y) = x*x + y*y + 2*x*y
		// f(1, 2) = 1*1 + 2*2 + 2*1*2 => 9 :)
		
		Methods refVar = new Methods();
		
		//int result = refVar.f(10, 20);
		
		//int result = Methods.f(10, 20);
		
		// f if marked as static and belongs to the same class, where main also resides
		// we can directly execute it also :)
		int result = f(10, 20);
		
		System.out.println("Result is: "+result);
		

	}

}
