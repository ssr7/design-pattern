package io.sr7.tutorial.behavioral.visitor.refactoring_guru;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}