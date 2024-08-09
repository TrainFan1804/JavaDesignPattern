package structural.bridge;

class ConcreteAbstraction implements Abstraction {

    private Implementor implementor;

    public ConcreteAbstraction(Implementor implementor) {

        this.implementor = implementor;
    }

    @Override
    public String function() { return this.implementor.implementation(); }
}
