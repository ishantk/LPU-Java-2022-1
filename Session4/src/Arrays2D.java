
public class Arrays2D {

	public static void main(String[] args) {
		
		// 2-D Array :)
		// Array of Arrays
		int[][] worldCovidCases = {
										// 0       1       2
										{5421511, 62354, 53254}, // 0
										{413243, 22354, 73254},  // 1
										{65152, 512331, 76665},  // 2
										{6434, 51423, 89898, 52434},    // 3
										{98988, 64533, 76523, 45234, 26565}    // 4
								  };
		
		System.out.println("worldCovidCases is: "+worldCovidCases);
		System.out.println("worldCovidCases.length is: "+worldCovidCases.length);
		
		/*System.out.println("worldCovidCases[0] is: "+worldCovidCases[0]);
		System.out.println("worldCovidCases[0].length is: "+worldCovidCases[0].length);*/
		
		for(int idx=0;idx<worldCovidCases.length;idx++) {
			System.out.println("worldCovidCases["+idx+"] is: "+worldCovidCases[idx]+" and length is: "+worldCovidCases[idx].length);
		}
		
		System.out.println("worldCovidCases[1][2]: "+worldCovidCases[1][2]); // 73254
		
		System.out.println();
		//Read the 2D Array with for loop
		
		// outer loop in 2d array
		for(int i=0;i<worldCovidCases.length;i++) {
			
			// inner loop for inner 1d array
			for(int j=0;j<worldCovidCases[i].length;j++) {
				
				System.out.print(worldCovidCases[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Enhaced For Loop on 2d Arrays");
		
		// Enhanced for loop on 2d array
		for(int[] array : worldCovidCases) {
			for(int element : array) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}
		
		// Array of Array of Arrays
		int[][][] worldPopulation = {
				
				// india-population
				{
					{35144, 643663, 8374438}, // state1 (population district wise)
					{35144, 643663, 8374438}, // state2
					{35144, 643663, 8374438}, // state3
				},
				// usa-population
				{
					{35144, 643663, 8374438}, // state1 (population district wise)
					{35144, 643663, 8374438}, // state2
					{35144, 643663, 8374438}, // state3
				}
		};
		
		// Whenever we have homogeneous data, we should prefer arrays to store lot of data
		// With arrays, we can structure the data well
		// with loops, we can iterate and make the algo work effectively
		
		// n-d array -> collection of n-1d arrays :)
		
		System.out.println();
		
		// create 2d array with size
		//int[][] array = new int[5][3]; // create 5 1-d arrays, with each array having 3 elements
									   // by default all the elements in array will be 0
		
		int[][] array = new int[5][]; // creates 5 1-d arrays, where size of 1-d arrays not decided yet
		array[0] = new int[3];
		array[1] = new int[5];
		array[2] = new int[8];
		array[3] = new int[2];
		array[4] = new int[4];
		
		array[1][1] = 5;
		
		for(int[] arr : array) {
			for(int element : arr) {
				System.out.print(element+"  ");
			}
			System.out.println();
		}

	}

}


