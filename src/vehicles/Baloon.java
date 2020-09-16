package vehicles;

import weather.Coordinates;
import weather.WeatherProvider;
import weather.WeatherTower;

public class Balloon extends src.simulation.vehicles.Aircraft implements Flyable {

    WeatherTower weatherTower;
    Balloon(String name, Coordinates coordinates) {
        this.name = "Balloon";
        this.coordinates = coordinates;
    }

    public void updateConditions() {
        if (WeatherProvider.weather = "RAIN") {
            coordinates.getHeight() = height - 5;
        }
    }
    
    public void registerTower(WeatherTower weatherTower) {}

}