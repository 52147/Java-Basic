interface Animal {
    String NAME = "Animal"; 
    String getName();
    void sound();
}

class Dog implements Animal {
    private static final String TYPE = "Dog"; 
    private String name;

    Dog(String name) {
        this.name = name;
    }

    public String getType() {
        return TYPE;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void sound() {
        System.out.println("The dog says: woof woof");
    }
}

public class TestMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        System.out.println(dog.getName());
        System.out.println(dog.getType());
        dog.sound();
    }
}
