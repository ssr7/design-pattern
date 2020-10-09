package io.sr7.tutorial.behavioral.command;

public class TestCommand {
    public static void main(String[] args) {
        AsiaReceiver asiaReceiver = new AsiaReceiver();
        ShutdownCommand shutdownCommand = new ShutdownCommand(asiaReceiver);
//        CommandInvoker commandInvoker=new CommandInvoker(new ShutdownCommand(new AsiaReceiver()));
        CommandInvoker commandInvoker=new CommandInvoker(shutdownCommand);
        commandInvoker.run();

         CommandInvoker commandInvoker2=new CommandInvoker(new RestartCommand(new EuropeReceiver()));
         commandInvoker2.run();

    }
}
