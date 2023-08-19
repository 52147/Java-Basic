public class Main {
    
    void demo(int a) {
        System.out.println("a: " + a);
    }
    
    void demo(int a, int b) {
        System.out.println("a and b: " + a + "," + b);
    }
    
    double demo(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        // Create an instance of Main
        Main obj = new Main();
        
        // Call the demo method with one integer argument
        obj.demo(10);
        
        // Call the demo method with two integer arguments
        obj.demo(10, 20);
        
        // Call the demo method with one double argument
        double result = obj.demo(5.5);
        System.out.println("Output of demo(5.5): " + result);
    }
}

