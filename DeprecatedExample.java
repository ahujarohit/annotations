class DeprecatedExample {
    /**
     * @deprecated As of release 2.0 sayMessage has been replaced by sayHello
     */
    @Deprecated (since = "2.0", forRemoval = true) 
    public void sayMessage() {
        System.out.println("Hello World");
    }
}

class Test {
    @SuppressWarnings({"removal","deprecated"})
    public static void main(String args[]) {
        DeprecatedExample de = new DeprecatedExample();
        de.sayMessage();
    }
}