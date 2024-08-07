package main.patterns.creationalpatterns.factorymethod;

class ConcreteProduct implements Product {

    @Override
    public void foo() {
    
        System.out.println("ConcreteProduct");
    } 
}
