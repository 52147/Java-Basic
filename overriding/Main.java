class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    // this method overrides the method in the parent class
    void makeSound() {
        System.out.println("The dog says: bark bark");
    }
}
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}