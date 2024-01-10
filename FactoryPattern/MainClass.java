package FactoryPattern;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Shape shapeObj = factory.getShape(input);
        shapeObj.draw();
    }
}

//Factory pattern is used when we need to create objects of classes based on condition satisfying,
//when we have a large codebase
//Factory helps in easy managing and creating objects
