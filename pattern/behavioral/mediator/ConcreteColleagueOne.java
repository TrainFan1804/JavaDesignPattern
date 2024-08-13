package behavioral.mediator;

class ConcreteColleagueOne extends Colleague {

    public ConcreteColleagueOne(Mediator mediator) {

        super(mediator);
    }

    public void action() {

        System.out.println("You are in " + this.getClass());
        super.mediator.mediate(this);
    }
}
