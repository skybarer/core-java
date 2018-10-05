package oops;


//Illegal modifier for the class FinalClassTest; only public, abstract & final are permitted

//if a class is declared as final it cannot be extended

//The class FinalClassTest can be either abstract or final, not both
public final  class FinalClassTest {
	
	public FinalClassTest() {
		
	}
	
	// In final class we cannot write abstract methods
	
	
	public static void main(String[] args) {
		System.out.println("final class main method");
	}

}
