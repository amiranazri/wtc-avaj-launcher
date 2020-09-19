package simulation;

import java.io.*;
import vehicles.Flyable;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        Iterator i = observers.iterator();
        while (i.hasNext()) {
            flyable.updateConditions();
         }
    }
}