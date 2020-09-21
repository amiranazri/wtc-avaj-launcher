package vehicles;

import java.io.*;
import java.util.HashMap;
import simulation.Writer;
import weather.WeatherTower;
import weather.WeatherProvider;
import weather.*;
import vehicles.*;

public class Balloon extends Aircraft implements Flyable {
    
    private WeatherTower weatherTower;

    Balloon(String name, Coordinates coordinates)
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
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 4);
        }
        else if (weather == "SUN") {
            this.coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight() + 4);
        }
        else if (weather == "SNOW") {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 15);
        }
        else if (weather == "FOG") {
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 3);
        }

        HashMap<String, String> weatherUpdate = new HashMap<String, String>();
        weatherUpdate.put("RAIN", "Never mind cats and dogs, it's raining chickens and ducks! What Fowl weather.");
        weatherUpdate.put("SUN", "I tried to find out where the sun went last night... it just dawned on me.");
        weatherUpdate.put("SNOW", "I can't land in this weather! Looks like there's snow way out...");
        weatherUpdate.put("FOG", "If I disappeared into this fog, would I be mist?");
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