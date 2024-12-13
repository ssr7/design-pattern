package io.sr7.tutorial.structural.decorator.functional;

import java.util.List;

public class DarkCoffee extends Coffee {
    protected DarkCoffee(List<Extension> extensionList) {
        super(extensionList);
    }

    @Override
    public Integer price() {
        return 2;
    }

    @Override
    public String getDesc() {
        return "DARK ";
    }
}
