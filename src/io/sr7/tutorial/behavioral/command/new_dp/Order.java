package io.sr7.tutorial.behavioral.command.new_dp;

public abstract class Order {
    private final Cooke cooke;

    protected Order(Cooke cooke) {
        this.cooke = cooke;
    }

    public abstract void run();
}
