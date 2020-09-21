package vehicles;

import vehicles.*;
import vehicles.Flyable;
import simulation.Writer;

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
            System.out.println("test 1");
            Balloon Balloon = new Balloon(name, coordinates);
            System.out.println("test 2");
            return Balloon;
        }
        else {
            System.out.println("Error: Vehicle type is invalid [" + type + "]");
            return null;
        }
    }
}