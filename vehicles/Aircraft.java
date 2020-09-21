package vehicles;

import vehicles.*;
import simulation.Writer;

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
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
        vehicleType = "Aircraft";
    }

    private long nextId()
    {
        idCounter++;
        return (idCounter);
    }

    public String aircraftID() {
        String newID = this.vehicleType + "#" + "(" + this.id + ")" + ": ";
        Writer.storeMessage(newID);
        return newID;
    }

}