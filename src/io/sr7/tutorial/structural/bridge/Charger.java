package io.sr7.tutorial.structural.bridge;

public interface  Charger {
    void charging();
    ChargerWire getChargerWire(); //This is a bridge between interface class and implementor
}
