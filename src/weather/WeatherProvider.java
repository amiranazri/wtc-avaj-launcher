package weather;

import java.util.Random;
import weather.Coordinates;

public class WeatherProvider
{
    private static WeatherProvider weatherProvider;
    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    
    private WeatherProvider() {}
    
    public static WeatherProvider getProvider() {
        new WeatherProvider();
        return (weatherProvider);
    }
    
    public String getCurrentWeather(Coordinates coordinates)
    {
        int randomizeWeather = new Random().nextInt(currentWeather);
        return (weather[randomizeWeather]);
    }
}
