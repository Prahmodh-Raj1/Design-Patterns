package Adapter;
import Adaptee.WeightMachine;
import Adapter.WeightMachineAdapter;
public class WeightMachineAdapterImplementation implements WeightMachineAdapter{
    WeightMachine weightMachine;  //concrete adapter object being created ( has-a relationship)
    //adapter adapts an adaptee
    //now our adapter knows how to work with the existing interface
    public WeightMachineAdapterImplementation(WeightMachine obj){
        this.weightMachine= obj;
    }
    @Override
    public double getWeightInKilos() {
        double WeightInPounds = weightMachine.getWeightInPound();  //interacting with the adaptee
        //doing the conversion
        //System.out.println("Weight in pounds inside the impl class is "+WeightInPounds);
        double weightInKilo = WeightInPounds * 0.45;
        return weightInKilo;
    }
}
