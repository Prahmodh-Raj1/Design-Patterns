import StrategyInterfaces.DriveStrategy;
public class Car {
    DriveStrategy driveobj; //creating an object of that instance so that it helps in implementing the drive functionalities
    //of the child classs as per their requirements
    //we don't use the new keyword , so that it doesnt bound to one particular type
    //Constructor injection, making an object of the type specified by the child class
    Car(DriveStrategy obj){
        this.driveobj = obj;
    }
    public void drive(){
        driveobj.drive();
    }
}
