
public class Methods {
	
	
	// Method -> Return Type, Name and InputList(arguments)
	// void is return type -> what method returns, as of now void means nothing
	// printArray1 is the name of method
	// int[] array is an input to the method
	void printArray1(int[] array) { // non-static method
		int max = array[0];
		
		for(int element : array) {
			if(element > max) {
				max = element;
			}
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Max is: "+max);
		System.out.println();
	}
	
	static void printArray2(int[] array) { // static method
		int max = array[0];
		
		for(int element : array) {
			if(element > max) {
				max = element;
			}
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Max is: "+max);
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		
		int[] productPrices = {1200, 4500, 3200, 4300, 1500};
		int[] covidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
		int[] scores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};
		
		
		// Object Construction Statement for the class Methods, which we created
		// to execute non static methods -> we need reference to the object
		/*Methods refVar = new Methods();

		// executing a non static method
		refVar.printArray1(productPrices);
		refVar.printArray1(covidCases);
		refVar.printArray1(scores);*/
		
		// To execute a static method, we just need the name of class :)
		Methods.printArray2(productPrices);
		Methods.printArray2(covidCases);
		Methods.printArray2(scores);
		
		
		// non static methods -> belongs to the objects
		//	needs reference of object to execute them
		
		// static methods -> belongs to the class
		//	needs just the class name to execute them
		
		/*int max = productPrices[0];
		
		for(int element : productPrices) {
			if(element > max) {
				max = element;
			}
			System.out.print(element+" ");
		}
		System.out.println();
		System.out.println("Max in productPrices is: "+max);
		System.out.println();
		
		max = covidCases[0];
		for(int element : covidCases) {
			if(element > max) {
				max = element;
			}
			System.out.print(element+" ");
		}
		
		System.out.println();
		System.out.println("Max in covidCases is: "+max);
		System.out.println();
		
		
		max = scores[0];
		for(int element : scores) {
			if(element > max) {
				max = element;
			}
			System.out.print(element+" ");
		}
		
		System.out.println();
		System.out.println("Max in scores is: "+max);
		System.out.println();*/
		
		// When, we create some algo or logical operation
		// we end up in using it again and again for some reasons for the solution
		// writing same code again , is waste of development time
		// Hence, we create method and move the common code thr :)
		
		
		// Assignment: 1. Sort the same arrays using the algos: 
		//					1.1 Bubble Sort
		//					1.2 Insertion Sort

	}

}
