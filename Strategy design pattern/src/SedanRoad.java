
import StrategyInterfaces.NormalDriveStrategy;
public class SedanRoad extends Car{
    SedanRoad() {
        super(new NormalDriveStrategy());
    }


}
