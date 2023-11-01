public class Car implements CloneableCar{
    private String model;
    private int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public Car(Car car){
        this.model = car.model;
        this.year = car.year;
    }
    @Override
    public CloneableCar clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
