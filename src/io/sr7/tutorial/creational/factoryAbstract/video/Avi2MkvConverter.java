package io.sr7.tutorial.creational.factoryAbstract.video;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Avi2MkvConverter extends Converter {
    public Avi2MkvConverter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
