package behavioral.command;

class Client {

    public static void main(String[] args) {
        
        // in real life application you would use different commands
        Invoker invoker = new Invoker(new ConcreteCommand(new ConcreteReceiver()),
                                        new ConcreteCommand(new ConcreteReceiver()));
        invoker.operationOne();
        invoker.operationTwo();
    }
}
