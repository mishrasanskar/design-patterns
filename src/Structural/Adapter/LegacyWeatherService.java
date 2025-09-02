package Structural.Adapter;

public class LegacyWeatherService implements WeatherService {


    private  int temperature;
    private int conditions;

    public LegacyWeatherService(int temperature, int conditions) {
        this.temperature = temperature;
        this.conditions = conditions;
    }

    @Override
    public String getWeatherData() {
        return "<weather><temperature>" + temperature + "</temperature><condition>" + conditions + "</condition></weather>";
    }

}
