package weather;

import java.io.*;
import vehicles.Flyable;
import java.util.Iterator;
import java.util.ArrayList;

public abstract class Tower {
    private ArrayList<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
    }

    public void unregister(Flyable flyable) {
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        Iterator<Flyable> i = observers.iterator();
        while (i.hasNext()) {
            i.next().updateConditions();
         }
    }
}