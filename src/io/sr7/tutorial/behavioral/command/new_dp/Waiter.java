package io.sr7.tutorial.behavioral.command.new_dp;

public class Waiter  {
    private final Order order;

    public Waiter(Order order) {
        this.order = order;
    }

    public void execute() {
        order.run();
    }
}
