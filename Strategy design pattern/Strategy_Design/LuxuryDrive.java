package Strategy_Design;

//Concrete Strategy
public class LuxuryDrive implements Drive{
    @Override
    public void drive(){
        System.out.println("Luxury Drive Method implemented");
    }
}
