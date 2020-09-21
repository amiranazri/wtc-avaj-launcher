package vehicles;

import java.io.*;
import simulation.Writer;
import weather.*;
import vehicles.*;

public class Coordinates
{
    Coordinates(int longitude, int latitude, int height){
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    WeatherTower weatherTower = new WeatherTower();
    private int longitude;
    private int latitude;
    private int height;
    public static String coordinateStr;

        public int getLongitude() {
            if (longitude < 1) { 
                longitude = 1;
            }
            
            return (longitude);
        }

        public int getLatitude() {
            if (latitude < 1) {
                latitude = 1;
            }
            return (latitude);
        }

        public int getHeight() {
            if (height < 0) {
                height = 0;
            }
            else if (height > 100) {
                height = 100;
            }
            else if (height <= 0) {
                Writer.storeMessage("Aircraft is landing...");
            }
            return (height);
        }
}