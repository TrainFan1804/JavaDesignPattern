package behavioral.chainofresponsibility;

class Receiver extends Handler {

    public Receiver(Handler successor) {

        super(successor);
    }

    @Override
    public void handleRequest() {
    
        System.out.println("Current Receiver: " + this);

        if (super.successor != null) super.successor.handleRequest();
    }
}
