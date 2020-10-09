package io.sr7.tutorial.creational.factoryAbstract.image;

import io.sr7.tutorial.creational.factoryAbstract.Converter;

public class Bmp2PdfConverter extends Converter {
    public Bmp2PdfConverter(byte[] input) {
        super(input);
    }

    @Override
    public byte[] convert() {
        System.out.println(this.getClass());
        return new byte[0];
    }
}
