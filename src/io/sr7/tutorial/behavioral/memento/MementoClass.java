package io.sr7.tutorial.behavioral.memento;

public class MementoClass {
    History  history;
    private String text;

    public MementoClass(String text) {
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
