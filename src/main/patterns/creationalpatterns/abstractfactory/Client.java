package main.patterns.creationalpatterns.abstractfactory;

class Client {

    public static void main(String[] args) {
    
        foo(new ConcreteAbstractFactoryOne());
        foo(new ConcreteAbstractFactoryTwo());        
    }

    public static void foo(AbstractFactory factory) {

        System.out.println(factory.createProductA());
        System.out.println(factory.createProductB());
    }
}
