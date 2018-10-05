package oops;

class CompileTimeParent {
	
	int a =0;
	
	static int b=1;
	

	public static void compilteTimeTest() {
		System.out.println("CompileTimeParent");
	}

}

class CompileTimeChild extends CompileTimeParent {

	public static void compilteTimeTest() {
		System.out.println("CompileTimeChild");
	}

}

public class CopiletimePolymorphism {

	
	public static void main(String[] args) {
		
		CompileTimeParent.compilteTimeTest();//CompileTimeParent
		CompileTimeChild.compilteTimeTest();//CompileTimeChild
		
		CompileTimeParent parent = new CompileTimeParent();
		parent.compilteTimeTest();//CompileTimeParent
		
		
		CompileTimeParent parentChild = new CompileTimeChild();
		parentChild.compilteTimeTest();//CompileTimeParent
		
		
		CompileTimeChild child = new CompileTimeChild();
		child.compilteTimeTest();//CompileTimeChild
		
	}

}
