package main.patterns.behavioralpatterns.chainofresponsibility;

/**
 * The sender send a signal to the {@link ChainOfResponsibility}.
 * 
 *  @author                             o.le
 * @version                             0.3
 * @since                               0.17
 */
class Sender {

    private ChainOfResponsibility chainOfResponsibility;

    public static void main(String[] args) {
        
        Sender sender = new Sender();
        ChainOfResponsibility partOne = new Receiver(false);
        sender.chainOfResponsibility = partOne;

        ChainOfResponsibility partTwo = new Receiver(true);
        sender.chainOfResponsibility.setNext(partTwo);

        sender.chainOfResponsibility.handleRequest();
    }
}
