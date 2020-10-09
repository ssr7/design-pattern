package io.sr7.tutorial.behavioral.mediator;

public abstract  class MessageSenderReceiver {
    protected  Mediator mediator;
    private String username;

    public MessageSenderReceiver(Mediator mediator, String username) {
        this.mediator = mediator;
        this.username = username;
        this.mediator.registry.put(username,this);
    }

    public String getUsername() {
        return username;
    }

    public abstract void sendMessage(MessageSenderReceiver receiver, String message);
    public void receive(MessageSenderReceiver sender, String message){
        System.out.println(this.getUsername()+": Receive Message From : " + sender.getUsername() + "  -> "+ message);
    }
}
