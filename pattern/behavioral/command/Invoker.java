package behavioral.command;

class Invoker {

    private Command[] commands = new Command[2];

    public Invoker(Command command1, Command command2) {

        this.commands[0] = command1;
        this.commands[1] = command2;
    }

    public void operationOne() { this.commands[0].execute(); }

    public void operationTwo() { this.commands[1].execute(); }
}
