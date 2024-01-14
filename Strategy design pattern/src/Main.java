package Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive(); //applying overriding of the default method
        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new OffRoadVehicle();
        vehicle2.drive();
    }
}
