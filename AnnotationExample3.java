import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
class AnnotationExample3 {
	@What(description = "An annotation test method")
	@MyAnno(str = "Testing", val = 100)
	public static void myMeth() {
		AnnotationExample3 ob = new AnnotationExample3();
		try {
		Annotation annos[] = ob.getClass().getAnnotations();
	System.out.println("All annotations for AnnotationExample3:");
			for(Annotation a : annos)
				System.out.println(a);
			System.out.println();

		Method m = ob.getClass( ).getMethod("myMeth");
			annos = m.getAnnotations();
		System.out.println("All annotations for myMeth:");
			for(Annotation a : annos)
				System.out.println(a);
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}
	public static void main(String args[]) {
		myMeth();
	}
}

//MyAnnotation myAnno = m.getAnnotation(MyAnno.class);
//Annotation myAnno[] = m.getAnnotations();






