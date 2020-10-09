package io.sr7.tutorial.behavioral.command;

public interface Receiver {
    void start();
    void restart();
    void shutdown();
    void disconnect();
}
