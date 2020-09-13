package vehicles;

import weather.Coordinates;

public abstract class Aircraft {
    protected long id;
    private static long idCounter;
    protected String name;
    protected Coordinates coordinates;
    private long nextId;
    
    protected Aircraft(String name, Coordinates coordinates) {
        name = this.name;
        coordinates = this.coordinates;
        nextId = this.id;

    }

}