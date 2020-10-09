package io.sr7.tutorial.creational.Prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Person person = Person.getBuilder()
                .name("saeid")
                .family("saeid")
                .age(21l)
                .address("TEHRAN")
                .car(new Car("2020 model"))
                .build();
        Person clone = person.clone();
        System.out.println(clone.hashCode());
        System.out.println("Car: "+ clone.getCar().hashCode());

        Person clone2 = person.clone();
        System.out.println(clone2.hashCode());
        System.out.println("Car"+ clone2.getCar().hashCode()); //shallow copy: object did not copy


    }
}
