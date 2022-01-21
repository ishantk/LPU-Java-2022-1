
public class ReferenceVsCopy {

	public static void main(String[] args) {
	
		// 2 different containers with different names
		int a = 10;
		int b = a;		// Value Copy Operation
		
		
		// we got a single array container
		// but 2 reference variables referring to it
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = a1;	// Reference Copy Operation
		
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		// update operation
		b = 20; // on primitive
		a2[2] = 77; // on reference

		System.out.println("b now is: "+b);
		System.out.println("a1[2]: "+a1[2]);
		System.out.println("a2[2]: "+a2[2]);
		
	}

}
