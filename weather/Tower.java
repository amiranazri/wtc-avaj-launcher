package weather;

import java.io.*;
import java.util.Iterator;
import java.util.ArrayList;
import vehicles.*;
// import vehicles.Balloon;
// import vehicles.JetPlane;
// import vehicles.Helicopter;
// import vehicles.Flyable;
// import vehicles.Aircraft;
import simulation.Writer;

public abstract class Tower {
    private ArrayList<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
        // Writer.storeMessage("Tower says: " + "" + "unregistered from weather tower.");
        
    }

    protected void conditionsChanged() {
        Iterator<Flyable> i = observers.iterator();
        while (i.hasNext()) {
            i.next().updateConditions();
         }
    }
}