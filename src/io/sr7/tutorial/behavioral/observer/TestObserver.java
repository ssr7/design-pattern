package io.sr7.tutorial.behavioral.observer;

public class TestObserver {
    public static void main(String[] args) {
        NewsAgency observable=new NewsAgency();
        Channel observer=new ChannelOne();
        Channel observer2=new ChannelTwo();
        observable.addObserver(observer);
        observable.addObserver(observer2);
        observable.setNews("Hello world");

    }
}
