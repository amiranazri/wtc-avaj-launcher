package simulation;

import java.io.*;
import vehicles.Flyable;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void Register(Flyable flyable) {

    }

    public void Unregister(Flyable flyable) {

    }

    protected void conditionsChanged() {

    }
}