package vehicles;

import vehicles.Flyable;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int Longitude, int Latitude, int Height) {
        if (type.equals("Helicopter")) {
            return new Helicopter(name, coordinates);
        }
        else if (type.equals("JetPlane")) {
            return new JetPlane(name, coordinates);
        }
        else if (type.equals("Balloon")) {
            return new Balloon(name, coordinates);
        }
        else {
            System.out.println("Error: Vehicle type is invalid [" + type + "]");
        }
    }
}