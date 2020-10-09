package io.sr7.tutorial.structural.facade.service;

public class NoSqlService<T> {
    protected void save(T t,String name){
        System.out.println("Save t in Name: " + name);
    }
    public String get(T t){
        return "Id: "+1 + " name: "+2;
    }
}
