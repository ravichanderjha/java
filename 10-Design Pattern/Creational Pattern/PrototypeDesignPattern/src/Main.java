public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car originalCar = new Car("Sedan", 2023);
        Car clonedCar = (Car) originalCar.clone();

        System.out.println("Original Car: " + originalCar.toString());
        System.out.println("Clone Car: " + clonedCar.toString());

        Book originalBook = new Book("Physics");
        Book clonedBook = originalBook.clone();

        System.out.println("Original Book: " + originalBook.toString());
        System.out.println("Clone Book: " + clonedBook.toString());

    }
}