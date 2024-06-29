import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnno {
    String str() default "Default Value of str.";
}

@MyAnno(str = "This is a @Target class.")
class TargetExample {

    @MyAnno(str = "This is a @Target method.")
    public static void sayHello() {
        System.out.println("Hello World");
    }
}
