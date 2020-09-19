package weather;

public class WeatherTower{
    public String getWeather(Coordinates coordinates) {
        WeatherProvider getCurrentWeather = new weatherProvider();
        return getCurrentWeather.getCurrentWeather();
    }
    private void changeWeather() {
        conditionsChanged();
    }
}