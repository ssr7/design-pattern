package io.sr7.tutorial.structural.bridge;

/**
 * Using in car
 */
public class LighterCharger implements Charger {
    private ChargerWire chargerWire;

    public LighterCharger(ChargerWire chargerWire) {
        this.chargerWire = chargerWire;
    }

    @Override
    public void charging() {
        System.out.println("charging ...");
        chargerWire.connectCharger();
    }

    @Override
    public ChargerWire getChargerWire() {
        return chargerWire;
    }
}
