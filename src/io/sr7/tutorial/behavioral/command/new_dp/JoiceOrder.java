package io.sr7.tutorial.behavioral.command.new_dp;

public class JoiceOrder extends Order {
    private final Cooke cooke;
    protected JoiceOrder(Cooke cooke) {
        super(cooke);
        this.cooke= cooke;
    }

    @Override
    public void run() {
        cooke.prepareIngredients();
        cooke.mixIngredients();
        cooke.setupSomeStaff();
    }
}
