package io.sr7.tutorial.creational.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * simple caching ...
 */
public class RegisteryPerson {
    private static Map<String,Person> personList=new HashMap<>(); // does not thread safe
    public Person get(String name){
        Person person = personList.get(name);
        return  person.clone();//we do not allow to user to edit our object, so we return copy of object
    }
    public void add(String name,Person person){
        personList.put(name,person);
    }
}
