package Strategy_Design;

//Concrete class that inherits Context class
public class SportsVehicle extends Vehicle{
    public SportsVehicle(Drive driverCapability){
        super(driverCapability);
    }
    @Override
    public void drive() {
        super.drive();
    }
}
