package SingletonPattern;
import java.util.*;
public class SingletonPattern {
    private int value;
    private static  SingletonPattern singleton = null;
    private SingletonPattern(int val){
        this.value = val;
    }
    public static SingletonPattern getInstance(int currentValue){
        if(singleton == null){
            //if the instance hasn't been initialized yet
            singleton = new SingletonPattern(currentValue);
        }
        return singleton;
    }
    public void addValue(int addition){
        this.value += addition;
    }
    public int getValue(){
        return value;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Same values indicate one instance creation, incorrect otherwise");
        System.out.println();
        SingletonPattern singleton = SingletonPattern.getInstance(100);
        SingletonPattern anotherSingleton = SingletonPattern.getInstance(100);

        System.out.println("Value of singleton: " + singleton.getValue());
        System.out.println("Value of anotherSingleton: " + anotherSingleton.getValue());

        
        if(singleton == anotherSingleton){
            System.out.println("Point to the same instance in memory");
        }else{
            System.out.println("Singleton and anotherSingleton are different instances");
        }
        System.out.println("Adding some value to both the instances");

        int add1 = sc.nextInt();
        int add2 = sc.nextInt();
        singleton.addValue(add1);
        System.out.println("Updated value of singleton instance: " + singleton.getValue());
        anotherSingleton.addValue(add2);

        System.out.println("Updated value of anotherSingleton instance: " + anotherSingleton.getValue());
    }
}
