package weather;

import vehicles.Coordinates;
import weather.*;
import simulation.Writer;

public class WeatherTower extends Tower {
    public String getWeather(Coordinates coordinates) {
        WeatherProvider obj = WeatherProvider.getProvider();
        
        return obj.getCurrentWeather(coordinates);
    }
    public void changeWeather() {
        conditionsChanged();
    }
}
