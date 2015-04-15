package com.train.partern.behaviour.command;

public class Invoker {
private Command command;
    
    public void setCommand(Command ccmmand) {
        this.command = command;
    }
    
    public void execute() {
        command.execute();
    }

}
