package io.sr7.tutorial.behavioral.mediator;

public class Client extends MessageSenderReceiver {
    public Client(Mediator mediator, String username) {
        super(mediator, username);
    }

    @Override
    public void sendMessage(MessageSenderReceiver receiver,String message) {
        System.out.println("Send message From: "+this.getUsername() + " TO  "+receiver.getUsername() + " -> "+ message);
        mediator.broadcast(this,receiver.getUsername(),message);
    }
}
