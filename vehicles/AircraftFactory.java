package vehicles;

import vehicles.*;
import vehicles.Flyable;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int Longitude, int Latitude, int Height) {
        
        Coordinates coordinates = new Coordinates(Longitude, Latitude, Height);

        if (type.equals("Helicopter")) {
            Helicopter Helicopter = new Helicopter(name, coordinates);
            return Helicopter;
        }
        else if (type.equals("JetPlane")) {
            JetPlane JetPlane = new JetPlane(name, coordinates);
            return JetPlane;
        }
        else if (type.equals("Balloon")) {
            Balloon Balloon = new Balloon(name, coordinates);
            return Balloon;
        }
        else {
            System.out.println("Error: Vehicle type is invalid [" + type + "]");
            return null;
        }
    }
}