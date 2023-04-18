package Observer;

public class CurrentWeatherConditionDisplay implements Observer{
    private int temperature;
    private int humidity;
    public CurrentWeatherConditionDisplay(Observable obs){
        obs.registerObserver(this);  //to subscribe to the weatherstation class
    }
    public void update(int temperature,int humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    private void display(){
        System.out.println("Current weather condition is Temperature: "+temperature+" Humidity: "+humidity);
    }
}
