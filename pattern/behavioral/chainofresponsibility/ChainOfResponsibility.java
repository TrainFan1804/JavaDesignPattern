package behavioral.chainofresponsibility;

/**
 * If multiple object are linked together to work together on a incoming signal
 * you call it the chain of responsibility. The 'chain' is working through till
 * the programm find the solution.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.14
 */
public abstract class ChainOfResponsibility  {

    protected static int objectCount = 0;

    protected boolean isHandler;
    protected ChainOfResponsibility next;

    protected ChainOfResponsibility(boolean isHandler) {

        ChainOfResponsibility.objectCount++;
        this.isHandler = isHandler;
    }

    /**
     * Set the next object in the chain.
     * 
     * @param next                      The next object.
     */
    protected void setNext(ChainOfResponsibility next) {

        this.next = next;
    }

    /**
     * Handle the incoming singlan from the {@lind Sender}.
     */
    abstract void handleRequest();
}
