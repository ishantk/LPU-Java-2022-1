
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// 1d arrays -> we can store multiple values in a container :)
		
		// Initialize the array with values, when you know the data already
		
		// Implicit Syntaxes -> here new int[] is taken care by compiler
		// Syntax 1
		int array1[] = {10, 20, 30, 40, 50};
		
		// Syntax 2
		int[] array2 = {10, 20, 30, 40, 50};
		
		// Explicit Syntaxes
		// Syntax 3
		int array3[] = new int[]{10, 20, 30, 40, 50};
				
		// Syntax 4
		int[] array4 = new int[]{10, 20, 30, 40, 50};
		

		
		// when we don't know the elements for array, initialize with size
		// Syntax 5
		// create the array with the size and hence, all the elements will be by default 0
		int array5[] = new int[5];
		// Syntax 6
		int[] array6 = new int[5];
		
		System.out.println("array1 is: "+array1);
		System.out.println("array2 is: "+array2);
		System.out.println("array3 is: "+array3);
		System.out.println("array4 is: "+array4);
		System.out.println("array5 is: "+array5);
		System.out.println("array6 is: "+array6);
		
		
		// Bracket before and bracket after is for declaration
		
		int a1[], a2;
		a1 = new int[10]; // a1 can refere an array
		a2 = 256; // a2 is a prinitive integer

		int[] a3, a4; // both will be reference variables to array
		a3 = new int[5]; // a1 will refer to array
		a4 = new int[10]; // a2 will refer to array
	}

}
