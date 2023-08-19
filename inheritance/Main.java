class Vehicle {
    String brand;
    void honk() {
        System.out.println("Honk honk!");
    }
}

class Car extends Vehicle {
    int wheels;
    void drive() {
        System.out.println("Car is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.wheels = 4;
        myCar.honk(); // Output: "Honk honk!"
        myCar.drive(); // Output: "Car is driving..."
    }
}

