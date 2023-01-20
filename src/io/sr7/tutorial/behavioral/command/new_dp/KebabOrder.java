package io.sr7.tutorial.behavioral.command.new_dp;

public class KebabOrder extends Order {
    private final Cooke cooke;
    protected KebabOrder(Cooke cooke) {
        super(cooke);
        this.cooke= cooke;
    }

    @Override
    public void run() {
        cooke.prepareIngredients();
        cooke.mixIngredients();
        cooke.cooking();
    }
}
