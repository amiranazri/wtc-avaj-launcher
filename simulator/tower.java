package simulator;

import java.util.ArrayList;
import java.util.List;
import vehicles.Flyable;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void Register(flyable Flyable) {

    }

    public void Unregister(flyable Flyable) {

    }

    protected void conditionsChanged() {

    }
