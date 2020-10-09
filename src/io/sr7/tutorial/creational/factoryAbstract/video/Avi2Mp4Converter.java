package io.sr7.tutorial.creational.factoryAbstract.video;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Avi2Mp4Converter extends Converter {
    public Avi2Mp4Converter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
