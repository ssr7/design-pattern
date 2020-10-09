package io.sr7.tutorial.structural.facade.service;

public class NoSqlEntity  extends  BaseEntity{
    private String name;

    public NoSqlEntity(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
