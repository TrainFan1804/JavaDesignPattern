package behavioral.mediator;

class ConcreteColleagueTwo extends Colleague {

    public ConcreteColleagueTwo(Mediator mediator) {
        
        super(mediator);
    }

    public void action() {

        System.out.println("You are in " + this.getClass());
    }
}
