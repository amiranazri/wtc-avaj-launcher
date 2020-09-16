package simulation;

import java.util.ArrayList;
import java.util.List;
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