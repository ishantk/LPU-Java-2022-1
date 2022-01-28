package com.auribises.one;

// public class
public class One {
	
	// We can use access modifiers with both attribute and methods
	
	private void pvtShow() {
		System.out.println("[One] Private show of One");
	}
	
	void defShow() {
		System.out.println("[One] Default show of One");
	}

	protected void protShow() {
		System.out.println("[One] Protected show of One");
	}

	public void pubShow() {
		System.out.println("[One] Public show of One");
	}

}


// default class
class Two{
	
	private void pvtShow() {
		System.out.println("[Two] Private show of One");
	}
	
	void defShow() {
		System.out.println("[Two] Default show of One");
	}

	protected void protShow() {
		System.out.println("[Two] Protected show of One");
	}

	public void pubShow() {
		System.out.println("[Two] Public show of One");
	}
	
}


// private and protected classes are not allowed
/*private class Three{
	
}

protected class Four{
	
}*/

// More than 1 public class is not allowed in the same source file
/*public class Five{
	
}*/

// we can have 1 public class but as many as default classes we want
