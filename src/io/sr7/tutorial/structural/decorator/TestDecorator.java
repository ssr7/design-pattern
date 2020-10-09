package io.sr7.tutorial.structural.decorator;

import java.io.File;

public class TestDecorator {
    public static void main(String[] args) {
        File file=new File("/tmp/t.1txt");
        SimpleStream simpleStream =new SimpleStream();
        AdvancedSteam advancedSteam =new AdvancedSteam(simpleStream);
        advancedSteam.writeToMemory(file);
        advancedSteam.readFromMemory(file);
        advancedSteam.out();



    }
}
