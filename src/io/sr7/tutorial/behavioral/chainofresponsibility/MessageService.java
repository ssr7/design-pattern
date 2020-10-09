package io.sr7.tutorial.behavioral.chainofresponsibility;

public class MessageService {
    public static void send(Message message){
        MessageHandler messageHandler= null;
        //create chain -> Last to first
        for (Message.Destination dest:message.getDestinationMap().keySet()) {
            switch (dest){
                case FAX:
                    messageHandler=new FaxMessageHandler(messageHandler);
                    break;
                case SMS:
                    messageHandler=new SmsMessageHandler(messageHandler);
                    break;
                case EMAIL:
                    messageHandler=new EmailMessageHandler(messageHandler);
                    break;
                default:
                    throw  new IllegalArgumentException("Bad Destination");
            }
        }
        messageHandler.handle(message);
    }
}
