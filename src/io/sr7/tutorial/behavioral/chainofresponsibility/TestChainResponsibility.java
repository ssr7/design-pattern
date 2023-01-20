package io.sr7.tutorial.behavioral.chainofresponsibility;

import java.io.IOException;

public class TestChainResponsibility {
    public static void main(String[] args) throws IOException {
       /* Logger logger= Logger.getLogger("Log");
        logger.setLevel(Level.FINEST); //trace log in log4j
        FileHandler fileHandler = new FileHandler("log.xml");
        fileHandler.setLevel(Level.ALL);
        logger.addHandler(fileHandler);

        ConsoleHandler consoleHandler=new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);
        logger.fine("Hello FINEST");
        logger.finer("Hello finer");
        logger.info("Hello INFO");
        logger.warning("Hello Warning");*/
        MessageHandler messageHandler = new SmsMessageHandler()
                .setNextHandler(new FaxMessageHandler()
                        .setNextHandler(new EmailMessageHandler()));
        messageHandler.execute();

       /* Message message=Message.getMessageBuilder().setMsg("Hello this is a test message")
               .addDestination(Message.Destination.FAX,"02122222222")
               .addDestination(Message.Destination.SMS,"09111111111")
               .addDestination(Message.Destination.EMAIL,"test@test.com")
               .build();
        message.getDestinationMap().keySet().forEach(e-> System.out.println(e.toString()));
       MessageService.send(message);*/
    }

}
