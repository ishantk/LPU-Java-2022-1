
public class WhyArrays {

	public static void main(String[] args) {
		
		// Covid Data in Single Value Containers for USA
		int usaTotalCases = 5421511;
		int usaNewCases = 62354;
		int usaNewRecovered = 53254;
		
		// Covid Data in Single Value Containers for India
		int indiaTotalCases = 413243;
		int indiaNewCases = 22354;
		int indiaNewRecovered = 73254;
		
		// Need of Arrays ?
		// Whenever we have lot of data in homogeneous profile
		
		int[] usaCases = {5421511, 62354, 53254};
		int[] indiaCases = {413243, 22354, 73254};
		
		// Reference Variable usaCases and indiaCases will be store in Stack
		// Data will be in Heap and HashCode will be available in the Reference Variable
		
		System.out.println("usaCases is: "+usaCases);
		System.out.println("indiaCases is: "+indiaCases);
		
		// update the value in array
		indiaCases[1] = 34511; // update the data in index1
		
		// read the array data:
		System.out.println("USA COVID DATA");
		for(int idx=0;idx<usaCases.length;idx++) {
			System.out.print(usaCases[idx]+" ");
		}
		
		System.out.println();
		
		System.out.println("INDIA COVID DATA");
		for(int idx=0;idx<indiaCases.length;idx++) {
			System.out.print(indiaCases[idx]+" ");
		}
		
		System.out.println();
		// enhanced for loop on 1-d array
		for(int element: indiaCases) {
			System.out.print(element+" ");
		}
		
		// deletion happens automatically when we exit the main method for the containers :)
		
		// BUT, for the cleaning of Heap Memory we have a program which runs after a certain interval of time again and again
		// Garbage Collector [Program in JVM] -> removes unused objects from the Heap area
		
		// GC works automatically. But in some scenarios when you feel your program is going extensive on memory
		// Then, we can also execute GC
		// System.gc(); // explicit request to GC to run and collect the unused objects and delete them

	}

}
