package io.sr7.tutorial.structural.decorator.functional;

import java.util.ArrayList;
import java.util.List;

public class TestFunctionalDecorator {
    public static void main(String[] args) {
        List<Extension> extensionList = new ArrayList<>();
        extensionList.add(new Milk());
        extensionList.add(new Sugar());
        Coffee coffee = new Espresso(extensionList);
        System.out.println("total price = " + coffee.getTotalPrice());
        System.out.println("total description = "+ coffee.getTotalDesc());
        System.out.println("After adding new sugar again ....... ");
        coffee.addExtension(new Milk());
        System.out.println("total price = " + coffee.getTotalPrice());
        System.out.println("total description = "+ coffee.getTotalDesc());
    }
}
