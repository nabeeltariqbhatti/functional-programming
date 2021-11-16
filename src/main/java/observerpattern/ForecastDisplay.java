package observerpattern;

public class ForecastDisplay implements  DisplayElement{
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData) {

        this.weatherData = weatherData;
    }

    @Override
    public void display() {

    }
}
