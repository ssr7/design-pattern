package io.sr7.tutorial.structural.decorator.functional;

import java.util.List;

public class Latte extends Coffee {
    protected Latte(List<Extension> extensionList) {
        super(extensionList);
    }

    @Override
    public Integer price() {
        return 4;
    }

    @Override
    public String getDesc() {
        return "LATTE ";
    }
}
