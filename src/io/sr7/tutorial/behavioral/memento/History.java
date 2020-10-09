package io.sr7.tutorial.behavioral.memento;

import java.util.LinkedList;

//we can use file to store state and object
// History class = caretaker
public class History {
    private LinkedList<MementoClass> historyList= new LinkedList<>();
    public void addHistory(MementoClass mementoClass){
        historyList.push(mementoClass);
    }
    public MementoClass undo(){
        return historyList.pop();
    }
}
