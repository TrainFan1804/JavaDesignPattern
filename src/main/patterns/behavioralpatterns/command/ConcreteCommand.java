package main.patterns.behavioralpatterns.command;

class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {

        this.receiver = receiver; 
    }

    @Override
    public void execute() {

        this.receiver.action();
    }
}
