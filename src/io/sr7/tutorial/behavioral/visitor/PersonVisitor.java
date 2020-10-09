package io.sr7.tutorial.behavioral.visitor;

public class PersonVisitor implements Visitor {
    @Override
    public void visit(Creature creature) {
        System.out.println("Visit Person : "+creature.getName());
        //do stuff
    }
}
