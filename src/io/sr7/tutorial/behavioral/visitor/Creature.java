package io.sr7.tutorial.behavioral.visitor;

public interface Creature {
     void thinking();
     static void  eating(){
         System.out.println("Eating ...");
     }

    String getName();
}
