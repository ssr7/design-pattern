package io.sr7.tutorial.structural.bridge;

/**
 * Tunable charger with key for tune voltage
 */
public class TunableCharger implements Charger {
    private ChargerWire chargerWire;

    public TunableCharger(ChargerWire chargerWire) {
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
