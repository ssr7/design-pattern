package io.sr7.tutorial.behavioral.mediator.another;

public class Button {
    private Mediator mediator;

    // constructor, getters and setters

    public void press() {
        mediator.press();
    }
}