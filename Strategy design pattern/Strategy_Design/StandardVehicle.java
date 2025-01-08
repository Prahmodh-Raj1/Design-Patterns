package Strategy_Design;

//Concrete class that inherits context class
public class StandardVehicle extends Vehicle{

    public StandardVehicle(Drive drivercapability){
        super(drivercapability);
    }

    public void drive(){
        super.drive();
    }
}
