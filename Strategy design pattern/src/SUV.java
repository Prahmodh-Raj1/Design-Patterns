import StrategyInterfaces.SportsDriveStrategy;
public class SUV extends Car{
    SUV(){
        super(new SportsDriveStrategy());  //creating an object of type sportsdrive strategy
    }
}
