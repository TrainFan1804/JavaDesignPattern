package behavioral.chainofresponsibility;

abstract class Handler  {

    protected Handler successor;

    protected Handler(Handler successor) {

        this.successor = successor;
    }
    
    abstract void handleRequest();
}
