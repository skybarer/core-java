package oops;

public abstract class AbstractTest implements InterfaceTest {

	int a = 0;
	static int b = 0;
	static final int c = 0;

	// can have abstract methods
	public abstract void abstractMethod();

	public void concreteMethod() {
		// can have concrete method
	}

	// abstract class may or may-not contain abstract methods/concrete methods.

	public static void main(String[] args) {
		System.out.println("abstract test");

	}

}
