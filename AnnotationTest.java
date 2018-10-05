/**
 * 
 */
package oops;

import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

@Documented
@Retention(CLASS)
public @interface AnnotationTest  {
	
	//extends ClassTest
	//Annotation type declaration cannot have an explicit superclass
	
	//implements InterfaceTest
	//Annotation type declaration cannot have explicit superinterfaces
	
	/* annotation cannot have main method.
	 * public static void main(String[] args) {
		System.out.println("main mwthod in annotation");
	}*/

}
