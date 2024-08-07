package main.patterns.creationalpatterns.factorymethod;

abstract class Creator {

    protected Product product;
    
    abstract Product factoryMethod();
}
