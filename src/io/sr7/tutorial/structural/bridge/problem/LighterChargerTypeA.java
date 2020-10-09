package io.sr7.tutorial.structural.bridge.problem;

public class LighterChargerTypeA extends TypeAWire {

    @Override
    public void connectCharger() {
        System.out.println("connect With Type A ..");
    }

    @Override
    public void doCharging() {
        System.out.println("Charging With Type A ..");
    }
}
