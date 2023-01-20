package io.sr7.tutorial.behavioral.command.new_dp;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class JoiceCooke implements Cooke {
    @Override
    public void prepareIngredients() {
        System.out.println("prepare joice");
    }

    @Override
    public void mixIngredients() {
        System.out.println("mix joice");
    }

    @Override
    public void setupSomeStaff() {
        System.out.println("setup joice");
    }

    @Override
    public void cooking() {
        throw new RuntimeException("invalid arg");
    }
}
