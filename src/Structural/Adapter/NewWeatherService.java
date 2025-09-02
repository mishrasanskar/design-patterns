package Structural.Adapter;

public class NewWeatherService {

    private int temperature;
    private int condition;

    public NewWeatherService(int temperature, int condition) {
        this.temperature = temperature;
        this.condition = condition;
    }

    public String fetchWeather() {
        return "{\"temperature\": " + temperature + ", \"condition\": \"" + condition + "\"}";
    }
}
