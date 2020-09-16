package vehicles;

import weather.WeatherTower;
import weather.Coordinates;
import java.lang.reflect;

public class helicopter extends src.simulation.vehicles.Aircraft implements Flyable {
    
    private helicopter(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    }

    public void updateConditions() {

    }

    public void registerTower(WeatherTower weatherTower) {

    }
}