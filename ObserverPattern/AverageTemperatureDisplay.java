package Observer;
//import java.util.*;
public class AverageTemperatureDisplay implements Observer{
    private int sumtemperature;
    private int totaltemperature;
    public AverageTemperatureDisplay(Observable observable){
        this.sumtemperature=0;
        this.totaltemperature=0;
        observable.registerObserver(this);
    }
    public void update(int temperature,int humidity){
        sumtemperature+=temperature;
        totaltemperature++;
        display();
    }
    public void display(){
        System.out.println("The average temperature for the past "+totaltemperature+" is "+(sumtemperature/totaltemperature));
    }
}
