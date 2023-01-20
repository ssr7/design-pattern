package io.sr7.tutorial.behavioral.chainofresponsibility;

public abstract class MessageHandler {
    private  MessageHandler nextHandler;

    public MessageHandler() {

    }

    public MessageHandler getNextHandler() {
        return nextHandler;
    }

    public MessageHandler setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this;
    }

    public abstract void handle(Message message);

    public abstract void execute();
}
