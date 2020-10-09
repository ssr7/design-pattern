package io.sr7.tutorial.structural.bridge;

public class TypeAWire implements ChargerWire {
    @Override
    public void connectCharger() {
        System.out.println("Connect Type A Charger....");
    }
}
