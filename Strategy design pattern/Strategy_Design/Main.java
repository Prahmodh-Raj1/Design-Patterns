package Strategy_Design;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new LuxuryVehicle(new LuxuryDrive());
        v1.drive();

        Vehicle v2 = new SportsVehicle(new StandardDrive());
        v2.drive();

        Vehicle v3 = new StandardVehicle(new SportsDrive());
        v3.drive();

    }


}
