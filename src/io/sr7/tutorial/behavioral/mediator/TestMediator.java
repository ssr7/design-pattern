package io.sr7.tutorial.behavioral.mediator;

public class TestMediator {
    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        Client client=new Client(mediator,"@Alice");
        Client client2=new Client(mediator,"@Bob");
        Client client3=new Client(mediator,"@Jody");
        Client client4=new Client(mediator,"@Jack");
        Group group=new Group(mediator,"Group1");
        group.clientList.add(client2);
        group.clientList.add(client3);
        group.clientList.add(client4);
//        client.sendMessage(client2,"Hello");
        group.sendMessage(group,"Hi Every Body");
    }
}
