package io.sr7.tutorial.structural.facade.service;

public class SqlService<T> {
    protected void save(T t){
        System.out.println("Save Object t in sql service");
    }
    public void delete(T t){
        System.out.println("Delete Object t in sql service");
    }
}
