package weather;

import java.io.*;
import java.util.Random;
import vehicles.*;

public class WeatherProvider
{
    private static WeatherProvider weatherProvider = null; //reference variable
    private static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    
    private WeatherProvider(){}
    
    public static WeatherProvider getProvider() {
        if (weatherProvider == null) {
            weatherProvider = new WeatherProvider();
        }
        return (weatherProvider);
    }
    
    public String getCurrentWeather(Coordinates coordinates)
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(weather.length);
        return (weather[randomNumber]);
    }
}
