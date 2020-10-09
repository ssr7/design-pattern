package io.sr7.tutorial.behavioral.memento;

public class TestMemento {
    public static void main(String[] args) {
        History history=new History();
        MementoClass mementoClass=new MementoClass("1");
        MementoClass mementoClass2=new MementoClass("2");
        MementoClass mementoClass3=new MementoClass("3");
        history.addHistory(mementoClass);
        history.addHistory(mementoClass2);
        history.addHistory(mementoClass3);
        System.out.println(history.undo().getText());
        System.out.println(history.undo().getText());
        System.out.println(history.undo().getText());


    }
}
