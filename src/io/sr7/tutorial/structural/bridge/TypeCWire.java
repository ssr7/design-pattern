package io.sr7.tutorial.structural.bridge;

public class TypeCWire implements ChargerWire {
    @Override
    public void connectCharger() {
        System.out.println("Connect Type C Charger ....");
    }
}
