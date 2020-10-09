package io.sr7.tutorial.structural.bridge;

public class TypeBWire implements ChargerWire {
    @Override
    public void connectCharger() {
        System.out.println("Connect Type B Charger ....");
    }
}
