public class Main {
    public static void main(String[] args) {

        Car car1 = new SUV();
        Car car2 = new SedanRoad();
        Car car3 = new CustomCar();
        car1.drive();
        car2.drive();
        car3.drive();
    }
}