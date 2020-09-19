package vehicles;

import java.io.*;
import weather.Coordinates;
import weather.WeatherTower;

public class jetPlane extends src.simulation.vehicles.Aircraft implements Flyable {

    private WeatherTower weatherTower;

    private jetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);

    }

    public void updateConditions() {
        if (this.weatherTower == null) {
            System.out.println("Error: No feedback from WeatherTower");
            return ;
        }
        HashMap<String, String> weatherUpdate = new HashMap<String, String>();
        weatherUpdate.put("RAIN", "You paint me a blue sky, then go back and turn it to rain, how will I ever land this plane...");
        weatherUpdate.put("SUN", "On an island in the sun, We’ll be playing and having fun, And it makes me feel so fine, I can’t control my plane...");
        weatherUpdate.put("SNOW", "Everything is icy and blue, I'm going to die before I get to you...");
        weatherUpdate.put("FOG", "The snake, the rat, the cat, the dog, How you gon' see 'em if you flying' through the fog?");

    }
    
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        System.out.println(newID + "registered to weather tower.");
    }
}