package structural.facade;

import structural.facade.subsystem.Facade;

class Client {

    public static void main(String[] args) {
    
        Facade facade = new Facade();
        facade.doSomething();
    }
}
