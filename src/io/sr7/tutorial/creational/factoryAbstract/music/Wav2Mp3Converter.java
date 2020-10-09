package io.sr7.tutorial.creational.factoryAbstract.music;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Wav2Mp3Converter extends Converter {
    public Wav2Mp3Converter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
