package creational.factorymethod;

abstract class Creator {

    protected Product product;
    
    abstract Product factoryMethod();
}
