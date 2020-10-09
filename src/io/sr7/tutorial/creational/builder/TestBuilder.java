package io.sr7.tutorial.creational.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 * There are a lot of property in our class
 * Reduce complexity
 * Like StringBuilder , queryBuilders
 */
public class TestBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("Hi");
        String str = stringBuilder.append("Saeid").append(" How Are you").append(10).append(" By").toString();
        System.out.println(str);
    }
    @Test
    public void  getPerson(){
        Person.PersonBuilder personBuilder= new Person.PersonBuilder();
        Person person = personBuilder
                .name("ali")
                .family("rezaei")
                .address("TEHRAN")
                .age(22)
                .build();
        Assert.assertTrue(person != null);
    }
}
