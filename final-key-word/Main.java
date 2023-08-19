
class Parent {
    final void demo() {
        System.out.println("Parent's demo method");
    }
}

class Child extends Parent {
    void demo() {  // Compile Error: demo() in Child cannot override demo() in Parent
        System.out.println("Child's demo method");  // overridden method is final
    }
}

Child2 extends FinalClass {  // Compile Error: cannot inherit from final FinalClass
}

final class FinalClass {
}

public class Main {
    public static void main(String[] args) {
        final int x = 10;
        x = 20;  // Compile Error: cannot assign a value to final variable x

        final StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        // sb = new StringBuilder();  // Compile Error: cannot assign a value to final variable sb

    }
}
