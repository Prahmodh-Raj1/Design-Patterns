package Observer;

public class Driver {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentWeatherConditionDisplay currentWeatherConditionDisplay = new CurrentWeatherConditionDisplay(weatherStation); //passing the subject
        AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation);
        weatherStation.parametersChanged(100,250);
        weatherStation.parametersChanged(120,230);
        weatherStation.parametersChanged(130,300);
        //with a single parameter change, all the observers are updated
    }



}
