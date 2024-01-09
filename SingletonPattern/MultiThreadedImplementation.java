package SingletonPattern;
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.*;
public class MultiThreadedImplementation {
    private int value;
    private  static MultiThreadedImplementation singleton = null;

    private MultiThreadedImplementation(int val) {
        this.value = val;
    }
    private static MultiThreadedImplementation getInstance(int currentValue) {
        if(singleton == null){
            singleton = new MultiThreadedImplementation(currentValue);
        }
        return singleton;
    }

    private void addValue(int addition){
        value+=addition;
    }

    private int getValue(){
        return value;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());

        Thread t2 = new Thread(()->{
            MultiThreadedImplementation anotherInst = MultiThreadedImplementation.getInstance(100);
            System.out.println("Value of anotherInst: " + anotherInst.getValue());
        });

        Thread t3 = new Thread(new Thread3());

        Thread t4 = new Thread(()->{
            MultiThreadedImplementation instance = MultiThreadedImplementation.getInstance(200);
            System.out.println("Value of instance: " + instance.getValue());
            instance.addValue(50);
            System.out.println("Updated value of instance: " + instance.getValue());
        });

        t1.start();
        t4.start();
        t3.start();
        t2.start();

    }
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            MultiThreadedImplementation singleton = MultiThreadedImplementation.getInstance(300);
            System.out.println("Value of singleton: " + singleton.getValue());
            singleton.addValue(25);
            System.out.println("Updated value of singleton: " + singleton.getValue());
        }
    }

    static class Thread3 implements Runnable{
        @Override
        public void run() {
            MultiThreadedImplementation thread3 = MultiThreadedImplementation.getInstance(400);
            System.out.println("Value of thread3: " + thread3.getValue());
        }
    }

}
