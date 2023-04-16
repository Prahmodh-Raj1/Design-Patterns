package Decorator;

public class ExtraTopping2 extends BurgerDecorator{
    private Burger burger;
    public ExtraTopping2(Burger burger){
        this.burger=burger;
    }
    @Override
    public String getDescription(){
        return burger.getDescription()+ " with extra topping2";
    }
    @Override
    public double getCost(){
        return burger.getCost()+25.0;
    }
}
