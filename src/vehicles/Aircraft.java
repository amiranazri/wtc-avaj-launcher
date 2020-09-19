package src.simulation.vehicles;

import weather.Coordinates;

public abstract class Aircraft {
    protected long id;
    private static long idCounter;
    protected String name;
    protected String vehicleType;
    protected Coordinates coordinates;

    public long getId() {
        return (this.id);
    }

    public String getName() {
        return (this.name);
    }

    protected Aircraft(String name, Coordinates coordinates)
    {
        name = this.name;
        coordinates = this.coordinates;
        nextId() = this.id;
        vehicleType = "Aircraft";
    }

    private long nextId()
    {
        Aircraft.idCounter++;
        return (Aircraft.idCounter);
    }

    public String aircraftID() {
        String newID = this.vehicleType + "#" + "(" + this.id + ")" + ": ";
        return aircraftID();
    }

}