package vehicles;

import vehicles.*;
import vehicles.Flyable;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int Longitude, int Latitude, int Height) {
        
        Coordinates coordinates = new Coordinates(Longitude, Latitude, Height);

        if (type.equals("Helicopter")) {
            return new Helicopter(name, coordinates);
        }
        else if (type.equals("JetPlane")) {
            JetPlane jetPlane = new JetPlane(name, coordinates);
			return jetPlane;
        }
        else if (type.equals("Balloon")) {
            Balloon balloon = new Balloon(name, coordinates);
			return balloon;
        }
        else {
            System.out.println("Error: Vehicle type is invalid [" + type + "]");
            return null;
        }
    }
}