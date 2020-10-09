package io.sr7.tutorial.behavioral.chainofresponsibility;

public abstract class MessageHandler {
    private final  MessageHandler nextHandler;

    public MessageHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public MessageHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handle(Message message);
}
