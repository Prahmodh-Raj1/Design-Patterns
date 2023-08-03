package Client;
import java.util.*;
import Adaptee.WeightMachineForPeople;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImplementation;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImplementation(new WeightMachineForPeople());
        System.out.println(weightMachineAdapter.getWeightInKilos());
        System.out.print("Enter the weight in pounds ");

        double pound = sc.nextDouble();
        WeightMachineAdapter weightMachineAdapter1 = new WeightMachineAdapterImplementation(new WeightMachineForPeople(pound));
        System.out.println("Weight in kilos for custom input is "+weightMachineAdapter1.getWeightInKilos());
    }
}
