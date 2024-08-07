package main.patterns.creationalpatterns.factorymethod;

class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        
        return new ConcreteProduct();
    }    
}
