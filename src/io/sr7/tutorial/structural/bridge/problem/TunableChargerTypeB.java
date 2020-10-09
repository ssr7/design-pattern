package io.sr7.tutorial.structural.bridge.problem;

public class TunableChargerTypeB extends TypeBWire {
    @Override
    public void connectCharger() {
        System.out.println("connect With Type B ..");
    }

    @Override
    public void doCharging() {
        System.out.println("Charging With Type B ..");
    }
}
