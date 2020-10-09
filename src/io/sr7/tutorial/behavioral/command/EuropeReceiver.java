package io.sr7.tutorial.behavioral.command;

public class EuropeReceiver implements Receiver {

    @Override
    public void start() {
        System.out.println("start Europe");
    }

    @Override
    public void restart() {
        System.out.println("restart Europe");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown Europe");
    }

    
    @Override
    public void disconnect() {
        System.out.println("disconnect Europe");
    }
}
