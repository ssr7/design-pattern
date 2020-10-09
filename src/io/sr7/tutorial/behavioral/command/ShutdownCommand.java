package io.sr7.tutorial.behavioral.command;

public class ShutdownCommand extends Command {
    public ShutdownCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.shutdown();
        receiver.disconnect();
    }
}
