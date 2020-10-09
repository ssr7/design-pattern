package io.sr7.tutorial.structural.bridge.problem;

public class TestProblemBridge {
    public static void main(String[] args) {
        HomeChargerTypeA homeChargerTypeA=new HomeChargerTypeA();
        homeChargerTypeA.connectCharger();
        homeChargerTypeA.doCharging();

        LighterChargerTypeB lighterChargerTypeB=new LighterChargerTypeB();
        lighterChargerTypeB.connectCharger();
        lighterChargerTypeB.doCharging();
    }
}
