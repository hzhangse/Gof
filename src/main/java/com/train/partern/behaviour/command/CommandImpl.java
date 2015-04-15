package com.train.partern.behaviour.command;

public class CommandImpl extends Command {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }
    
    public void execute() {
        receiver.receive();
    }
}
