package src.simulation.vehicles;

import weather.Coordinates;

public abstract class Aircraft {
    protected long id;
    private static long idCounter;
    protected String name;
    protected Coordinates coordinates;
    private long nextId;

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
        nextId = this.id;
    }

    private long nextId()
    {
        Aircraft.idCounter++;
        return (Aircraft.idCounter);
    }

}