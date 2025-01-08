package Strategy_Design;

//Context Class
public class Vehicle {
    Drive driverCapability;  //object of strategy interface

    public Vehicle(Drive driverCapability){
        this.driverCapability = driverCapability;
    }

    public void drive(){
        driverCapability.drive();
    }
}
