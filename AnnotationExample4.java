import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str() default "Testing";
	int val() default 9000;
}

class AnnotationExample4 {

	@MyAnno()
	public static void myMeth() {
		AnnotationExample4 ob = new AnnotationExample4();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}

	public static void main(String args[]) {
		myMeth();	
	}
}



