package oops;


// only public and abstract are allowed
public abstract interface InterfaceTest {
	
	//<T> allows generic types

	// public static final variables are allowed
	public static final int a = 0;
	
	int b =4; 
	
	//Interfaces cannot have constructors
	/*public InterfaceTest() {
		
	}*/

	public default void defaultMethod() {
		// default methods are allowed
	}

	public static void staticMethod() {
		// static methods are allowed
	}

	public static void main(String[] args) {

		System.out.println("interface main method");
		
		System.out.println(InterfaceTest.a);
		System.out.println(InterfaceTest.a);
	}

}
