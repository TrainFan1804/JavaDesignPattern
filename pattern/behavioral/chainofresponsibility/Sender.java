package behavioral.chainofresponsibility;

class Sender {

    private Handler handler;

    public Sender(Handler handler) {

        this.handler = handler;
    }

    public void sendSignal() { this.handler.handleRequest(); }
}
