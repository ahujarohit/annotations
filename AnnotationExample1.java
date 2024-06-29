import java.lang.annotation.*;		//Retention, RetentionPolicy
import java.lang.reflect.*;			//Method

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

class AnnotationExample1 {
	@MyAnno(str = "Annotation Example", val = 100)
	public static void myMeth() {
		AnnotationExample1 ob = new AnnotationExample1();
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

