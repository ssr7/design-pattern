package io.sr7.tutorial.behavioral.state;

public class State {
    private String stateName;
    private int priority;

    public State() {
    }

    public State(String stateName, int priority) {
        this.stateName = stateName;
        this.priority = priority;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "{\"State\":{"
                + "\"stateName\":\"" + stateName + "\""
                + ",\"priority\":\"" + priority + "\""
                + "}}";
    }
}
