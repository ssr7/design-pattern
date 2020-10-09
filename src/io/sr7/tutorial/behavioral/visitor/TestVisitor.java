package io.sr7.tutorial.behavioral.visitor;

public class TestVisitor {
    public static void main(String[] args) {
        Visitor visitor=new PersonVisitor();
        Person person=new Person("Alice");
        person.accept(visitor);

        Animal animal=new Animal("Ant");
        animal.accept(new AnimalVisitor());
    }
}
