abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract void sound();  // Abstract method (does not have a body)
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // The dog class must override the abstract method from animal class
    @Override
    void sound() {
        System.out.println("The dog says: woof woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName());
        dog.sound();
    }
}


