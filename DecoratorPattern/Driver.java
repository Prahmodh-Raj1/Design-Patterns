package Decorator;

public class Driver {
    public static void main(String[] args) {
        Burger burger = new Burger1();
        System.out.println(burger.getDescription()+" , "+burger.getCost());
        burger = new ExtraTopping1(burger);  //achieving runtime polymorphism
        System.out.println(burger.getDescription()+ " , "+ burger.getCost());
        burger = new ExtraTopping2(burger); //achieving runtime polymorphism
        System.out.println(burger.getDescription()+ " , "+burger.getCost());

    }
}
