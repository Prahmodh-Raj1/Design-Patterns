package Strategy_Pattern;
import Strategy_Pattern.Strategy.NormalDriveStrategy;
public class GoodsVehicle extends Vehicle{
    public GoodsVehicle(){
        super(new NormalDriveStrategy());
    }

}
