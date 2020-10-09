package io.sr7.tutorial.behavioral.observer.javaimpl;

import java.util.Observable;
import java.util.Observer;

public class MyObserver2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("observer2: receive message from "+ o + " -> "+ arg);
    }
}
