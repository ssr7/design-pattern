package io.sr7.tutorial.behavioral.command;

public class RestartCommand extends Command {
    public RestartCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.restart();
        receiver.disconnect();
    }
}
