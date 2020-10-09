package io.sr7.tutorial.structural.composite;

public class Menu extends MenuComponent {

    public Menu(String path, String name) {
        super(path, name);
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        children.add(menuComponent);
        return  this;
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        children.remove(menuComponent);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder  stringBuilder=new StringBuilder(" ::Menu:: ");
        stringBuilder.append(print());
        children.forEach(leaf->stringBuilder.append("\t").append(leaf.toString()));
        return stringBuilder.toString();
    }
}
