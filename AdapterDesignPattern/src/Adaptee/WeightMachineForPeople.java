package Adaptee;

import Adapter.WeightMachineAdapter;

public class WeightMachineForPeople implements WeightMachine{
    protected double pounds;
    public WeightMachineForPeople(){
        this.pounds = 28;
    }
    public WeightMachineForPeople(double pounds){
        //System.out.println("Inside the constructor, the value of pounds is "+pounds);
        this.pounds = pounds;
    }

    @Override
    public double getWeightInPound() {
        return pounds;
    }


}
