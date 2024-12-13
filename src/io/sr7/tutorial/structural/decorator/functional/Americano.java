package io.sr7.tutorial.structural.decorator.functional;

import java.util.List;

public class Americano extends Coffee {
    public Americano(List<Extension> extensionList) {
        super(extensionList);
    }

    @Override
    public Integer price() {
        return  1;
    }

    @Override
    public String getDesc() {
        return  "AMERICANO ";
    }
}
