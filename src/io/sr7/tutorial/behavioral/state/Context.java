package io.sr7.tutorial.behavioral.state;

public class Context {
    State state=new State();

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
