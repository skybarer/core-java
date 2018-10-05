package oops;

public class ConcreteClassTest extends AbstractTest {

	static int $a = 1;
	static final int MIN_WIDTH = 4;

	// concrete class extends abstract class

	public static void main(String[] args) {
		System.out.println($a);
		System.out.println("class main method.");
	}

	// all abstract class methods need to overridden
	@Override
	public void abstractMethod() {

	}

}
