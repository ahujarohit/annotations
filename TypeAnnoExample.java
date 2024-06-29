import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface TypeAnno { }

class TypeAnnoExample {

    public static void myMethod() {
        	@TypeAnno String str;
    }

    public @TypeAnno String getMessage() {
        String str = new String("Hello World");
        return str;
    }

    public void sayMessage(@TypeAnno String str) {
        System.out.println(str);            
    }

    public void sayMessageAgain(String str) throws @TypeAnno Exception {
        System.out.println(str);            
    }

    public static <@TypeAnno T> void sayMessageOnceAgain(String str) {
        System.out.println(str);            
    }

    public static void main(String args[]) {
        myMethod();
    }
}

