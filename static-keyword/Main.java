class MyClass {
    // static variable
    public static int staticVar = 5;

    // static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

public class Main {
    public static void main(String[] args) {
        // access the static variable
        System.out.println(MyClass.staticVar);

        // call the static method
        MyClass.staticMethod();
    }
}