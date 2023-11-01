public class MotorCycleFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new MotorCycle();
    }
}
