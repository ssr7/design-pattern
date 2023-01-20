package io.sr7.tutorial.behavioral.chainofresponsibility;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler() {
        ;
    }

    @Override
    public void handle(Message message) {
        if (message.getDestinationMap().containsKey(Message.Destination.EMAIL)){
            System.out.println("Send Email to "+ message.getDestinationMap().get(Message.Destination.EMAIL));
        }
        if (getNextHandler()!=null){
            getNextHandler().handle(message);
        }
    }

    @Override
    public void execute() {
        System.out.println("Email worked ...");

        if (getNextHandler() !=null){
            getNextHandler().execute();
        }
    }
}
