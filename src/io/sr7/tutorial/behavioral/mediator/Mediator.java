package io.sr7.tutorial.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
    public Map<String, MessageSenderReceiver> registry=new HashMap<>();
    public void broadcast(MessageSenderReceiver sender, String receiver, String message){
        if (registry.containsKey(receiver)){
            MessageSenderReceiver messageReceiver = registry.get(receiver);
            messageReceiver.receive(sender,message);
        }
    }
}
