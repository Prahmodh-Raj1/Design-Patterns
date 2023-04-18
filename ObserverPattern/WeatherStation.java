package Observer;

import java.util.*;

public class WeatherStation implements Observable{
    private List<Observer> observers;   //stores the list of all subscribed observers
    private int temperature;
    private int humidity;
    public WeatherStation(){
        this.observers=new ArrayList<>();  //instantiating the observers arraylist
    }
    private boolean hasObserver(Observer obs){
        int index= observers.indexOf(obs);
        return index>=0;
    }
    public void registerObserver(Observer obs){
        if(!hasObserver(obs)){
            observers.add(obs);
        }
    }
    public void removeObserver(Observer obs){
        if(hasObserver(obs)){
            observers.remove(observers.indexOf(obs));
        }
    }
    public void notifyObservers(){
        observers.forEach(observer-> observer.update(temperature,humidity));
    }
    public void parametersChanged(int temperature,int humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();  //whenever the values change, we need to notify the observers
    }
}
