public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle car = carFactory.create();
        car.drive();

        TruckFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.create();
        truck.drive();

        MotorCycleFactory motorCycleFactory = new MotorCycleFactory();
        Vehicle motorCycle = motorCycleFactory.create();
        motorCycle.drive();

    }
}