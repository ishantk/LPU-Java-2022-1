
public class MutableStrings {

	public static void main(String[] args) {
		
		String str = new String("John");
		String name = str + " Watson"; //str.concat(" Watson");
		System.out.println("str is: "+str);
		System.out.println("name is: "+name);
		
		// Mutable Strings: StringBuffer and StringBuilder
		
		//StringBuffer buffer = "John"; // error
		// Is a bit slower as it is thread-safe
		StringBuffer buffer = new StringBuffer("John");
		buffer.append(" Watson");
		System.out.println("buffer is: "+buffer);
		
		// A bit more faster and not thread-safe
		StringBuilder builder = new StringBuilder("Fionna");
		builder.append(" Flynn");
		System.out.println("builder is: "+builder);
		
		// Assignment: Explore the built in methods on StringBuffer and StringBuilder
		//			   Explore how capacity works with StringBuilder :)
	}

}
