package vehicles;

abstract class Aircraft {
    protected long id;
    private static long idCounter;
    protected String name;
    protected Coordinates coordinates;
    private long nextId;
    
    private Aircraft(name, coordinates) {
        
    }

}