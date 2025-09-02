package Structural.Adapter;

public class AdapterPatternDemo {

    public static void main(String[] args) {


        WeatherService legacyService = new LegacyWeatherService(23, 12);
        System.out.println("Legacy Weather Service Data:");
        System.out.println(legacyService.getWeatherData());


        NewWeatherService newService = new NewWeatherService(32, 15);
        WeatherService adaptedService = new NewWeatherServiceAdapter(newService);
        System.out.println("New Weather Service Data:");
        System.out.println(adaptedService.getWeatherData());


    }
}
