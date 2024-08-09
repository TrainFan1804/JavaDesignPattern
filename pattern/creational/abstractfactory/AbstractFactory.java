package creational.abstractfactory;

interface AbstractFactory {

    ProductA createProductA();

    ProductB createProductB();
}

class ConcreteAbstractFactoryOne implements AbstractFactory {

    @Override
    public ProductA createProductA() { return new ConcreteProductAOne(); }

    @Override
    public ProductB createProductB() { return new ConcreteProductBOne(); }
}


class ConcreteAbstractFactoryTwo implements AbstractFactory {

    @Override
    public ProductA createProductA() { return new ConcreteProductATwo(); }

    @Override
    public ProductB createProductB() { return new ConcreteProductBTwo(); }
}