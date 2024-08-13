package behavioral.chainofresponsibility;

class Client {

    public static void main(String[] args) {
        
        Receiver lastReceiver = new Receiver(null);
        Receiver midReceiver = new Receiver(lastReceiver);
        Receiver firstReceiver = new Receiver(midReceiver);

        Sender sender = new Sender(firstReceiver);
        sender.sendSignal();
    }
}
