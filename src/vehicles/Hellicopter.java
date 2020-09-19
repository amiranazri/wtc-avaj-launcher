package vehicles;

import java.io.*;
import weather.WeatherTower;
import weather.Coordinates;

public class helicopter extends src.simulation.vehicles.Aircraft implements Flyable {

    private WeatherTower weatherTower;

    private helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {
        if (this.weatherTower == null) {
            System.out.println("Error: No feedback from WeatherTower");
            return ;
        }
        HashMap<String, String> weatherUpdate = new HashMap<String, String>();
        weatherUpdate.put("RAIN", "It's raining.");
        weatherUpdate.put("SUN", "It's sunny.");
        weatherUpdate.put("SNOW", "It's snowing");
        weatherUpdate.put("FOG", "It's foggy.");

    }
    
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        System.out.println(newID + "registered to weather tower.");
    }
}