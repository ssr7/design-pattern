package io.sr7.tutorial.creational.factory.another;

import java.util.function.Supplier;

public enum CarFactory {
    BMW ("2018", BmwCar::new),
    TOYOTA("2020", ToyotaCar::new)
    ;
    public final String model;
    public final Supplier<Car> instance;

    CarFactory(String model, Supplier<Car> instance) {
        this.model = model;
        this.instance = instance;
    }
}
