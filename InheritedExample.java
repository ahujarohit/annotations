import java.lang.annotation.*;
import java.lang.reflect.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String value() default "This is the default description";
}

@What("This is an @Inherited Example")
class Base {}

class Derived extends Base {}

class InheritedExample {

    public static void main(String args[]) {
        Base base = new Base();
        Annotation annos[] = base.getClass().getAnnotations();
        System.out.println("Base : ");
        for(Annotation anno : annos)
            System.out.println(anno);
        
        Derived derived = new Derived();
        annos = derived.getClass().getAnnotations();
        System.out.println("Derived : ");
        for(Annotation anno : annos)
            System.out.println(anno);
    }
}




