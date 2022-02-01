/*
class MyInteger{
	
	int data;
	
	
	private MyInteger() {
		
	}
	
	private MyInteger(int data) {
		this.data = data;
	}
	
	static MyInteger valueOf(int data) {
		return new MyInteger(data);
	}
	
	@Override
	public int hashCode() {
		return data;
	}
	
	@Override
	public String toString() {
		return data+"";
	}
	
}*/

public class WrapperClasses {

	public static void main(String[] args) {
		
		// i is primitive type :)
		int i = 10;
		char ch = 'A';
		double d = 12.25;
		
		// If we wish to work on collections or data structures
		// we cannot work with primitives, we need references
		
		// BOXING: Represent a primitive as reference type i.e. an Object
		Integer iRef = Integer.valueOf(i);
		Character cRef = Character.valueOf(ch);
		Double dRef = Double.valueOf(d);
		
		// deprecated way of creating object for wrapper class: deprecated: it will be removed in future
		//Integer ref = new Integer(i);
		
		//MyInteger miRef = MyInteger.valueOf(i);
		
		// UNBOXING: Extract the primitive from a reference
		int j = iRef.intValue();
		char c = cRef.charValue();
		double e = dRef.doubleValue();
		
		
		// AUTO BOXING : Implicit Representation
		Integer iRef1 = i; // no need to execute valueOf method even :)
		// AUTO UN BOXING
		int k = iRef1; // no need to execute intValue method even :)
	}

}
