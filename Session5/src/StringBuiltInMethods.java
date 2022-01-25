
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String names = "John, Jennie, Jim, Jack, Joe";
		
		int idx = names.indexOf('o');
		System.out.println("index of o is: "+idx);
		
		idx = names.lastIndexOf('o');
		System.out.println("index of o from the end is: "+idx);
		
		int length = names.length();
		System.out.println("Length of names is: "+length);
		
		// Strings are indexed from 0 to n-1 where n is length of String
		char ch = names.charAt(2);
		System.out.println("ch is: "+ch);
		
		ch = names.charAt(length-1);
		System.out.println("ch at length-1 is: "+ch);
		
		idx = names.indexOf("Jim"); // index of Jim's J
		System.out.println("Index of jim is: "+idx);
		
		String subString = names.substring(idx); // from idx till end
		System.out.println("subString is: "+subString);
		
		String name = names.substring(idx, 17); // begin form idx and till 16 i.e. less than 17
		System.out.println("name is: "+name);
		
		String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(str.trim());
		}
		
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("A Valid Email");
		}else {
			System.out.println("Not a Valid Email");
		}
		
		String googleEmail = "john@gmail.com";
		if(googleEmail.endsWith("gmail.com")) { // also we got startsWith method
			System.out.println("Its a Valid Google Email");
		}else {
			System.out.println("Not a Valid Email");
		}

		// Assignment: 1. Explore the various String methods
		//			   2. Create an Array of File Names as String Array
		//				  And from the Array Filter various files as per their extensions
		//				  eg: String[] files = {"song1.mp3", "hello.txt", "image.png" //....};
		//				      Use the String built in methods and simply print the data extension wise
		//					  With the Methods: eg: printMP3Files(//..), printPNGFiles(//...)
		//				      Try using overloading here :)
		

	}

}
