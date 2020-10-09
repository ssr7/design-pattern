package io.sr7.tutorial.behavioral.observer.javaimpl;

import java.util.Observable;

public class MyObservable extends Observable {
    public void sendNews(String news){
        setChanged();
        notifyObservers(news);
    }
}
