package io.sr7.tutorial.behavioral.command.new_dp;

public class KebabCooke implements Cooke {
    @Override
    public void prepareIngredients() {
        System.out.println("Kebab praparing...");
    }

    @Override
    public void mixIngredients() {
        System.out.println("Kebab mixing ...");
    }

    @Override
    public void setupSomeStaff() {
        throw new RuntimeException("invalid arg");
    }

    @Override
    public void cooking() {
        System.out.println("Kebab Cooking ...");
    }
}
