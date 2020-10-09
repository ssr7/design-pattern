package io.sr7.tutorial.structural.composite;

public class TestComposite {
    public static void main(String[] args) {
        Menu menu=new Menu("/Root","Stock Exchange");
        menu.add(new Menu("/Report","reports"))
                .add(new Menu("/Account","account"))
                .add(new Leaf("/ChangePassword","chane password"));
        Menu menu1=new Menu("/Config","config");
        menu1.add(new Menu("/user","user"));
                Menu menu2=new Menu("/userPasswords","userPasswords");
                menu1.add(menu2);
        menu.add(menu1);
        System.out.println(menu.toString());
    }
}
