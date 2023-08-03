import StrategyInterfaces.CustomDriveStrategy;
public class CustomCar extends Car{
    CustomCar(){
        super(new CustomDriveStrategy());
    }
}
