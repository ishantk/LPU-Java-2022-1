// Object class in Java is the Parent to all classes
// Hence, we can have RTP implemented in Java as in
// Object's Reference Variable can Reefer to any Object

//class Student extends Object{
class Student{ // it will by default extend Object class
	
	int rollNum;
	String name;
	String email;
	
	Student(){
		
	}

	Student(int rollNum, String name, String email) {
		this.rollNum = rollNum;
		this.name = name;
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", email=" + email + "]";
	}
	
	
	// Override the toString method of Object class in Child Student class :)
	/*public String toString() {
		return rollNum+" - "+name+" - "+email+" - "+super.toString();
	}*/
	
	// Override hashCode and equals to compare 2 objects :)
	
}

// Remember, CA is Child of Student and hence, Grand Child of Object
// Multi-Level Inheritance
class CA extends Student{ // This does not mean CA will extends Object as well and this form multiple inheritance
	
}

public class ObjectClass {

	public static void main(String[] args) {
		
		Student sRef = new Student(1, "John", "john@example.com");
		//sRef.show();
		System.out.println(sRef.getClass());
		System.out.println(sRef.hashCode());
		System.out.println("sRef is: "+sRef);
		System.out.println("sRef.toString() is: "+sRef.toString());
		
		//Object oRef = new Student(); // Polymorphic Statement
		
		Student s1 = new Student(101, "Fionna", "fionna@example.com");
		Student s2 = new Student(101, "Fionna", "fionna@example.com");
		
		// equal method belongs to the Object class
		// Assignment: Override the equals method of Object in Student and compare the 2 objects :)
		if(s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}

	}

}
