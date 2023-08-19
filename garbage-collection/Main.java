class GarbageDemo {
    String name;
    
    // Constructor
    GarbageDemo(String name) {
        this.name = name;
        System.out.println("Object created: " + this.name);
    }

    // Called when the object is garbage collected
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object garbage collected: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two instances of GarbageDemo
        GarbageDemo obj1 = new GarbageDemo("obj1");
        GarbageDemo obj2 = new GarbageDemo("obj2");

        // Explicitly nullifying the references
        obj1 = null;
        obj2 = null;

        // Suggests that the Java Virtual Machine expend effort toward
        // recycling unused objects in order to make the space they currently
        // occupy available for quick reuse.
        System.gc();
    }
}

