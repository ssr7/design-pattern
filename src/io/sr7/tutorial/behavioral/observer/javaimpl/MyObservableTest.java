package io.sr7.tutorial.behavioral.observer.javaimpl;

public class MyObservableTest {
    public static void main(String[] args) {
        MyObservable myObservable=new MyObservable();
        myObservable.addObserver(new MyObserver1());
        myObservable.addObserver(new MyObserver2());
        myObservable.sendNews("Hello world");

    }
}
