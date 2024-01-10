package FactoryPattern;

public class ShapeFactory {

    Shape getShape(String input){
        switch (input){
            case "Circle":  //returning an object based on the condition
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
