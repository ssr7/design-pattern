package io.sr7.tutorial.structural.bridge;

public class HomeCharger implements Charger {
    private ChargerWire chargerWire;

    public HomeCharger(ChargerWire chargerWire) {
        this.chargerWire = chargerWire;
    }

    @Override
    public void charging() {
        getChargerWire().connectCharger();
        System.out.println("charging ...");
    }

    @Override
    public ChargerWire getChargerWire() {
        return chargerWire;
    }
}
