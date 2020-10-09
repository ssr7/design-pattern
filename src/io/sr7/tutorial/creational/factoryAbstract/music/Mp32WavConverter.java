package io.sr7.tutorial.creational.factoryAbstract.music;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Mp32WavConverter extends Converter {
    public Mp32WavConverter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
