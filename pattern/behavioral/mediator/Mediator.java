package behavioral.mediator;

interface Mediator {

    void setColleagueOne(Colleague colleagueOne);

    void setColleagueTwo(Colleague colleagueTwo);

    void mediate(Colleague colleague);
}
