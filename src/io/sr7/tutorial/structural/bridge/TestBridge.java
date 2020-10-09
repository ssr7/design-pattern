package io.sr7.tutorial.structural.bridge;

/**
 * Good reference: https://stacktraceguru.com/bridge-design-pattern
 */
public class TestBridge {
    public static void main(String[] args) {
        Charger homeCharger=new LighterCharger(new TypeBWire());
        homeCharger.charging();

        Charger carCharger=new LighterCharger(new TypeCWire());
        carCharger.charging();
    }
}
