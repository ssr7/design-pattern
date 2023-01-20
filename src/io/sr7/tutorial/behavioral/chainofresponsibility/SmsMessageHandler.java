package io.sr7.tutorial.behavioral.chainofresponsibility;

public class SmsMessageHandler extends MessageHandler {
    public SmsMessageHandler() {
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

    @Override
    public void execute() {
            System.out.println("Send Sms to ");
        if (getNextHandler()!=null){
            getNextHandler().execute();
        }
    }
}
