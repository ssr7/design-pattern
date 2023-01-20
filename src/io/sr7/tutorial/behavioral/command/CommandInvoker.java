package io.sr7.tutorial.behavioral.command;

public class CommandInvoker {
    //command store callback method
    private final Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }
    public void run(){
        for (int i =0;i<10;i++){
            System.out.println("Task i "+ i);
        }
        //After that we call callback method
        command.execute();
    }
}
