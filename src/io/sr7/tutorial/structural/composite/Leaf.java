package io.sr7.tutorial.structural.composite;

/**
 * this is menu item
 */
public class Leaf extends  MenuComponent{
    public Leaf(String path, String name) {
        super(path, name);
    }

    @Override
    public String toString() {
        return "\t::Leaf::"+print();
    }
}
