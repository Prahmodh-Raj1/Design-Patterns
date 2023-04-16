package Decorator;

public class Burger1 extends Burger{
    @Override
    public String getDescription(){
        return "Burger type1";
    }
    public double getCost(){
        return 180.0;
    }

}
