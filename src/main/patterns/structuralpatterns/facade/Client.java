package main.patterns.structuralpatterns.facade;

// custom import
import main.patterns.structuralpatterns.facade.subsystem.Facade;

class Client {

    public static void main(String[] args) {
    
        Facade facade = new Facade();
        facade.doSomething();
    }
}
