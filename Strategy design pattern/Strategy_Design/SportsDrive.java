package Strategy_Design;

//Concrete strategy
public class SportsDrive implements Drive{
    @Override
    public void drive(){
        System.out.println("Sports Drive pattern implemented");
    }
}
