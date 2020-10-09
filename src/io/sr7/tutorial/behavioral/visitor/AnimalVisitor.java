package io.sr7.tutorial.behavioral.visitor;

public class AnimalVisitor implements Visitor {
    @Override
    public void visit(Creature creature) {
        System.out.println("Visit Animal : " +creature.getName());
        //do stuff
    }
}
