package Strategy_Pattern;
import Strategy_Pattern.Strategy.SportsDriveStrategy;
public class SportsVehicle extends Vehicle{
    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
