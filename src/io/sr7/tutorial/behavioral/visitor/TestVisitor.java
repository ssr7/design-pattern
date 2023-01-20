package io.sr7.tutorial.behavioral.visitor;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestVisitor {
    public static void main(String[] args) {
        Visitor visitor=new PersonVisitor();
        Person person=new Person("Alice");
        person.accept(visitor);

        Animal animal=new Animal("Ant");
        assert animal.getName().equals("Antd");
        System.out.println("====");
        animal.accept(new AnimalVisitor());
        a.apply("ddd");
        System.out.println(b.andThen(integer -> integer+10).apply("ddd","dddd"));
    }
    static Function <String,String> a= (a)-> "dd";
    static BiFunction<String,String,Integer> b= (a,b)-> 10;

}
