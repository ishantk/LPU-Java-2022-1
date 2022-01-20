
public class Loops {

	public static void main(String[] args) {
		
		char blackSquare = '\u25A1';
		char whiteSquare = '\u25A0';
		
		/*System.out.print(whiteSquare+" ");
		System.out.print(blackSquare+" ");
		System.out.print(whiteSquare+" ");
		System.out.print(blackSquare+" ");
		System.out.print(whiteSquare+" ");
		System.out.print(blackSquare+" ");
		System.out.print(whiteSquare+" ");
		System.out.print(blackSquare+" ");*/
		
		//int idx = 1; // source
		
		// condition testing happens in the beginning
		/*while(idx<=4) { // destination
			//System.out.print(whiteSquare+" ");
			//System.out.print(blackSquare+" ");
			System.out.println(idx);
			idx++; // how to move from source to destination
		}*/
		
		
		// even if the condition will not be satisfied, this loop will be executed once !!
		/*do {
			System.out.print(whiteSquare+" ");
			System.out.print(blackSquare+" ");
			idx++;
		}while(idx<=4); // condition testing happens in the end*/
		
		for(int idx=1;idx<=4;idx++) {
			System.out.print(whiteSquare+" "+blackSquare+" ");
		}
		
	}

}
