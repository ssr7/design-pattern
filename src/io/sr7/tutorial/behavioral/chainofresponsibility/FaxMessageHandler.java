package io.sr7.tutorial.behavioral.chainofresponsibility;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.FAX)){
            System.out.println("Send Fax to "+ message.getDestinationMap().get(Message.Destination.FAX));
        }
        if (getNextHandler()!=null){
            getNextHandler().handle(message);
        }
    }
}
