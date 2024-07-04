package main.patterns.behavioralpatterns.chainofresponsibility;

/**
 * The class is a subtype of {@link ChainOfResponsibility}. This type will 
 * actually handle the incoming signal or will send it to the next.
 * 
 *  @author                             o.le
 * @version                             0.4
 * @since                               0.17
 */
class Receiver extends ChainOfResponsibility {

    Receiver(boolean isHandler) {

        super(isHandler);
    }

    @Override
    void handleRequest() {
        
        if (this.isHandler) {

            System.out.println("Object " + ChainOfResponsibility.objectCount 
                                + " handle the signal");
        } else {

            this.next.handleRequest();
        }
    }
}
