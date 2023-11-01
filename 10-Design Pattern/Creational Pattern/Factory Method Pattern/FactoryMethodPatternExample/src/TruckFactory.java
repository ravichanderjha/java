public class TruckFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new Truck();
    }
}
