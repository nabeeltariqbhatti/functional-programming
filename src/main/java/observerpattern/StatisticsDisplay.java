package observerpattern;

public class StatisticsDisplay implements  DisplayElement{
    private WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData) {

    this.weatherData = weatherData;
    }

    @Override
    public void display() {


    }
}
