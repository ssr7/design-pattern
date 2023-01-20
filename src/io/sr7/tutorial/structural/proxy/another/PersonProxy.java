package io.sr7.tutorial.structural.proxy.another;

public class PersonProxy  extends Person{
    @Override
    public void thinking() {
        System.out.println("First run proxy and then run main method");
        super.thinking();
    }
}
