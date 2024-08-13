package behavioral.mediator;

class Client {

    public static void main(String[] args) {
        
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueOne = new ConcreteColleagueOne(mediator);
        mediator.setColleagueOne(colleagueOne);
        Colleague colleagueTwo = new ConcreteColleagueTwo(mediator);
        mediator.setColleagueTwo(colleagueTwo);

        colleagueOne.action();
    }
}
