package vehicles;

import java.io.*;
import java.util.HashMap;
import simulation.Writer;
import weather.WeatherTower;
import weather.WeatherProvider;
import weather.*;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {
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
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 5, coordinates.getHeight());
        }
        else if (weather == "SUN") {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 10, coordinates.getHeight() + 2);
        }
        else if (weather == "SNOW") {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 7);
        }
        else if (weather == "FOG") {
            this.coordinates = new Coordinates(coordinates.getLongitude() + 1, coordinates.getLatitude(), coordinates.getHeight());
        }

        HashMap<String, String> weatherUpdate = new HashMap<String, String>();
        weatherUpdate.put("RAIN", "You paint me a blue sky, then go back and turn it to rain, how will I ever land this plane...");
        weatherUpdate.put("SUN", "On an island in the sun, We’ll be playing and having fun, And it makes me feel so fine, I can’t control my plane...");
        weatherUpdate.put("SNOW", "Everything is icy and blue, I'm going to die before I get to you...");
        weatherUpdate.put("FOG", "The snake, the rat, the cat, the dog, How you gon' see 'em if you flying' through the fog?");
        Writer.storeMessage(this.aircraftID() + weatherUpdate.get(weather));
    }
    
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        System.out.println("Tower says: " + this.aircraftID() + "registered to weather tower.");
    }

    public String getAircraftID()
    {
        return this.aircraftID();
    }
}