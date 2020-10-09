package io.sr7.tutorial.creational.factoryAbstract.image;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Jpeg2BmpConverter extends Converter {
    public Jpeg2BmpConverter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
