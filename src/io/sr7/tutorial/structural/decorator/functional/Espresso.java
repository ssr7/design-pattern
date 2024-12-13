package io.sr7.tutorial.structural.decorator.functional;

import java.util.List;

public class Espresso extends Coffee {
    protected Espresso(List<Extension> extensionList) {
        super(extensionList);
    }

    @Override
    public Integer price() {
        return 3;
    }

    @Override
    public String getDesc() {
        return "ESPRESSO ";
    }
}
