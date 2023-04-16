package Decorator;

public class ExtraTopping1 extends BurgerDecorator{
    private Burger burger;
    public ExtraTopping1(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+ " with extra topping1";
    }
    @Override
    public double getCost(){
        return burger.getCost()+15.0;
    }
}
