package io.sr7.tutorial.behavioral.observer.javaimpl;

import java.util.Observable;
import java.util.Observer;

public class MyObserver1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("observer1: receive message from "+ o + " -> "+ arg);
    }
}
