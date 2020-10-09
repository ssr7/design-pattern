package io.sr7.tutorial.creational.factoryAbstract;

public abstract class Converter {
    private byte[] input;

    public Converter(byte[] input) {
        this.input = input;
    }

    public abstract byte[] convert();

}
