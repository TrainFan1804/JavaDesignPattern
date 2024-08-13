package behavioral.mediator;

class ConcreteMediator implements Mediator {

    private Colleague colleagueOne;
    private Colleague colleagueTwo;

    public void setColleagueOne(Colleague colleagueOne) {

        this.colleagueOne = colleagueOne;
    }

    public void setColleagueTwo(Colleague colleagueTwo) {

        this.colleagueTwo = colleagueTwo;
    }

    @Override
    public void mediate(Colleague colleague) {

        if (colleague == this.colleagueOne) this.colleagueTwo.action();
        if (colleague == this.colleagueTwo) this.colleagueOne.action();
    }
}
