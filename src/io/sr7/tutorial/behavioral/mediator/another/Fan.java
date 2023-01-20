package io.sr7.tutorial.behavioral.mediator.another;

public class Fan {
    private Mediator mediator;
    public boolean isOn = false;

    // constructor, getters and setters

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }
}