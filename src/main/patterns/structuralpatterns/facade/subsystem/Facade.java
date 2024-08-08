package main.patterns.structuralpatterns.facade.subsystem;

public class Facade {

    private SubsystemClassOne sOne = new SubsystemClassOne();
    private SubsystemClassTwo sTwo = new SubsystemClassTwo();

    public void doSomething() {
        
        this.sOne.doSomething();
        this.sTwo.doSomething();
    }
}
