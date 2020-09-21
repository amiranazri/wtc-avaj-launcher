package vehicles;

import java.io.*;
import java.util.HashMap;
import simulation.Writer;
import weather.WeatherTower;
import weather.WeatherProvider;
import weather.*;

public class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }
    public void updateConditions() {
        if (this.weatherTower == null) {
            System.out.println("Error: No feedback from WeatherTower");
            return ;
        }

        if (this.coordinates.getLongitude() <= 0 || this.coordinates.getLatitude() <= 0 || this.coordinates.getHeight() <= 0) {
            Writer.storeMessage("Tower says: " + "" + "unregistered from weather tower.");
        }

        String weather = weatherTower.getWeather(this.coordinates);

        if (weather == "RAIN") {
            this.coordinates = new Coordinates(coordinates.getLongitude() + 5, coordinates.getLatitude(), coordinates.getHeight());
        }
        else if (weather == "SUN") {
            this.coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight() + 2);
        }
        else if (weather == "SNOW") {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 12);
        }
        else if (weather == "FOG") {
            this.coordinates = new Coordinates(coordinates.getLongitude() + 1, coordinates.getLatitude(), coordinates.getHeight());
        }

        HashMap<String, String> weatherUpdate = new HashMap<String, String>();
        weatherUpdate.put("RAIN", "It's raining.");
        weatherUpdate.put("SUN", "It's sunny.");
        weatherUpdate.put("SNOW", "It's snowing");
        weatherUpdate.put("FOG", "It's foggy.");
        Writer.storeMessage(this.aircraftID() + weatherUpdate.get(weather));
    }
    
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        Writer.storeMessage("Tower says: " + this.aircraftID() + "registered to weather tower.");
    }

    public String getAircraftID()
    {
        return this.aircraftID();
    }
}