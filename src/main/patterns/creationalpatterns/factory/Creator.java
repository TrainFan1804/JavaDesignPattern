package main.patterns.creationalpatterns.factory;

abstract class Creator {

    protected Product product;
    
    abstract Product factoryMethod();
}
