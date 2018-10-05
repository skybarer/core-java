package oops;

public enum EnumTest {
	
	/*
	 * provides type-safety and can be used inside switch statment like int
	 * variables.
	 */

	RED, GREEN, BLUE;
	
	private EnumTest() {
		// enum allows only private constructor
	}
	
	
	
	

	public static void main(String[] args) {
		
		/*cannot create object for enum */
	/*	EnumTest EnumTest = new EnumTest();*/

		System.out.println("enum main method");
		System.out.println(EnumTest.RED);
	}

}
