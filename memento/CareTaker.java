package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> states = new ArrayList<>();

    public void push(Memento state) {
        states.add(state);
    }

    public Memento pop() {
        int lastIndex = states.size() - 1;
        Memento lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
