package io.sr7.tutorial.structural.proxy.another.interface_base;

public class CircleProxy extends Circle {
    @Override
    public void paint() {
        System.out.println("proxy run first");
        super.paint();
    }
}
