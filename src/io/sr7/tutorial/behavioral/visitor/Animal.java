package io.sr7.tutorial.behavioral.visitor;

public class Animal implements Creature{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor){ //do something that not related to this class
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void thinking() {
        System.out.println("Animal is thinking :  " + name);
    }
}
