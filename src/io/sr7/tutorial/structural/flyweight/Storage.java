package io.sr7.tutorial.structural.flyweight;

public interface Storage<T,ID> {
    void save(T t);
    void delete(T t);
    T get(ID id);
    void init();

}
