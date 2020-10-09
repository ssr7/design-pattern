package io.sr7.tutorial.behavioral.command;

public class AsiaReceiver implements Receiver {

    @Override
    public void start() {
        System.out.println("start ASIA");
    }

    @Override
    public void restart() {
        System.out.println("restart ASIA");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown ASIA");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect ASIA");
    }
}
