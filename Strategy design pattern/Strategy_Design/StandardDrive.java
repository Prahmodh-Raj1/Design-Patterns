package Strategy_Design;

//Concrete strategy
public class StandardDrive implements Drive{

    @Override
    public void drive(){
        System.out.println("Implementing StandardDrive");
    }
}
