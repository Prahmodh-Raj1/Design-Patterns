package StrategyInterfaces;

public class CustomDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Implementing the Custom drive strategy");
    }
}
