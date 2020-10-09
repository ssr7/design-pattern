package io.sr7.tutorial.behavioral.chainofresponsibility;

public class SmsMessageHandler extends MessageHandler {
    public SmsMessageHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.SMS)){
            System.out.println("Send Sms to "+ message.getDestinationMap().get(Message.Destination.SMS));
        }
        if (getNextHandler()!=null){
            getNextHandler().handle(message);
        }
    }
}
