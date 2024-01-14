package Strategy_Pattern;
import Strategy_Pattern.Strategy.DriveStrategy;
public class Vehicle {
    DriveStrategy driveObject;  //creating an object of the interface

    //constructor injection, allowing the child classes to create objects according to their own requirements
    public Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}
