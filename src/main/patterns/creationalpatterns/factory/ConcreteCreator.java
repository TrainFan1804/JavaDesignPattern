package main.patterns.creationalpatterns.factory;

class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        
        return new ConcreteProduct();
    }    
}
