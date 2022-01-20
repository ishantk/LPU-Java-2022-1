
public class Arrays {

	public static void main(String[] args) {
	
		// State: Punjab
		int confirmedCases = 123651;
		int activeCases = 65432;
		int recoveredCases = 4413245;
		int vaccinated = 42141;
		
		// Whenever we have huge data size and it is homogeneous in nature
		// we must use arrays and save development time :)
		
		// Arrays will be indexed (0 to n-1, where n is length of array) and data can be accessed through indexes
		
		//			     0       1       2        3
		int[] cases = {123651, 65432, 4413245, 42141}; // implicit way of creating an array
		// cases is a reference variable which holds the hashcode of the array
		
		// Single Value Container
		System.out.println("confirmedCases: "+confirmedCases); // We will see the data i.e. value directly
		
		// Multi Value Container
		System.out.println("cases: "+cases); // we will not see data -> We will see HashCode
		/*System.out.println(cases[0]);
		System.out.println(cases[1]);
		System.out.println(cases[2]);
		System.out.println(cases[3]);*/
		
		/*for(int idx=0;idx<cases.length;idx++) {
			System.out.println(cases[idx]);
		}*/
		
		// Enhanced For Loop | For Each Loop | Its a read only loop
		for(int element : cases) {
			System.out.println(element);
		}

	}

}
