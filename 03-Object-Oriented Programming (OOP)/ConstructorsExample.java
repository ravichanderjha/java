class Person {
    String name;
    int age;

    // Constructor with parameters
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display information about the person
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        // Creating objects using the constructor
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        // Calling the displayInfo() method on person1 and person2 objects
        System.out.println("Person 1 Information:");
        person1.displayInfo();

        System.out.println("\nPerson 2 Information:");
        person2.displayInfo();
    }
}
