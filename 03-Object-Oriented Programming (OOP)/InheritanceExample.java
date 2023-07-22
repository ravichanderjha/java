// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Derived class (subclass)
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Creating objects and calling the sound() method
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound(); // Output: Animal makes a sound.
        dog.sound();    // Output: Dog barks.
        cat.sound();    // Output: Cat meows.
    }
}
