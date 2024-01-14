package Strategy_Pattern;
import Strategy_Pattern.Strategy.SportsDriveStrategy;
public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
