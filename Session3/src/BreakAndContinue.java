
public class BreakAndContinue {

	public static void main(String[] args) {
	
		int myFloor = 5;
		
		for(int floor=1;floor<=10;floor++) {
			System.out.println("Lift at Floor #"+floor);
			
			if(floor == myFloor) {
				System.out.println("My Floor Arrived");
				break; // terminate the loop :)
			}
		}
		
		System.out.println();
		
		
		for(int roll=1;roll<=10;roll++) {
			
			if(roll<=5) {
				continue; // skips the statements inside the loop written below it and take the loop into next iteration
			}
			
			System.out.println("Lets take viva for student with roll number: "+roll);
			System.out.println("Viva Started");
			System.out.println("Viva Finished");
		}
		
		// Assignment: 1. Explore labels with break and continue in Java and write a program for the same

	}

}
