package main.patterns.behavioralpatterns.command;

class ConcreteReceiver implements Receiver {

    @Override
    public void action() {
    
        System.out.println("Concrete Receiver");
    }
}
