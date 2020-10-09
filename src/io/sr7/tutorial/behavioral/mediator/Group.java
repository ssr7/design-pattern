package io.sr7.tutorial.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Group extends MessageSenderReceiver {
    protected List<Client> clientList =new ArrayList<>();

    public Group(Mediator mediator, String username) {
        super(mediator, username);
    }

    @Override
    public void sendMessage(MessageSenderReceiver receiver, String message) {
        clientList.forEach(client -> mediator.broadcast(this,client.getUsername(),message));
    }
}
