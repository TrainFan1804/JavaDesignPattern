package main.patterns.creationalpatterns.factory;

class ConcreteProduct implements Product {

    @Override
    public void foo() {
    
        System.out.println("ConcreteProduct");
    } 
}
