package io.sr7.tutorial.behavioral.command.new_dp;

public class TestWaiter {
    public static void main(String[] args) {
        KebabCooke kebabCooke = new KebabCooke();
        Order order = new KebabOrder(kebabCooke);
        Waiter waiter = new Waiter(order);
        waiter.execute();
        Thread thread = new Thread();
        thread.start();

    }
}
