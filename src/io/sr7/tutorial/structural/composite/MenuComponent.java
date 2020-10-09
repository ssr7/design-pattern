package io.sr7.tutorial.structural.composite;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class MenuComponent {
    public MenuComponent(String path, String name) {
        this.path = path;
        this.name = name;
    }

    private String path;
    private String name;
    protected  List<MenuComponent> children= new ArrayList<>();
    public MenuComponent add(MenuComponent menuComponent){
        throw  new NotImplementedException();
    }
    public MenuComponent remove(MenuComponent menuComponent){
        throw  new NotImplementedException();
    }
    public String print(){
        return String.format("%s->%s %n",path,name);
    }

    @Override
    public abstract  String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return Objects.equals(path, that.path) &&
                Objects.equals(name, that.name) &&
                Objects.equals(children, that.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, name, children);
    }
}
