// Class definition
class Car {
    // Data members
    String make;
    String model;
    int year;

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ClassesAndObjectsExample {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Civic";
        car2.year = 2021;

        // Calling the displayInfo() method on car1 and car2 objects
        System.out.println("Car 1 Information:");
        car1.displayInfo();

        System.out.println("\nCar 2 Information:");
        car2.displayInfo();
    }
}
