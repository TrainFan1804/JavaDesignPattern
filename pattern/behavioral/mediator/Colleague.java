package behavioral.mediator;

abstract class Colleague {

    protected Mediator mediator;

    protected Colleague(Mediator mediator) {

        this.mediator = mediator;
    }

    public abstract void action();
}
