package io.sr7.tutorial.structural.bridge.problem;

public  class HomeChargerTypeC extends TypeCWire {
    @Override
    public void connectCharger() {
        System.out.println("connect With Type C ..");
    }

    @Override
    public void doCharging() {
        System.out.println("charging With Type C ..");
    }
}
