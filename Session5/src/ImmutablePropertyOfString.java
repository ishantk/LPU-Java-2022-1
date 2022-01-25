
public class ImmutablePropertyOfString {

	public static void main(String[] args) {
		
		// Strings are Immutable
		// We cannot change the String, once it is created in the memory
		String quote = "be exceptional";
		
		System.out.println("quote is: "+quote);
		
		// Whenever a String manipulation is done
		// old String will not be modified
		// we will get a new String in the memory
		String upperCaseQuote = quote.toUpperCase();

		System.out.println("quote now is: "+quote);
		System.out.println("upperCaseQuote now is: "+upperCaseQuote);
		
		// here we are updating the reference variable to refer to the new Upper Case String
		// hence, the old lower case String will go dangling
		// i.e. String literal resides in the memory with no reference variable referring to it
		// quote = quote.toUpperCase(); -> not a good practice as per above explanation
		
		String names = "john, jennie, jim, jack, joe";
		System.out.println("names is: "+names);
		String replacedNames = names.replace('j', 'k');
		System.out.println("name now is: "+names);
		System.out.println("replacedNames is: "+replacedNames);
	}

}
