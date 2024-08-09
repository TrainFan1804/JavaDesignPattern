package creational.factorymethod;

class Client {

    public static void main(String[] args) {
    
        Creator creator = new ConcreteCreator();

        Product product = creator.factoryMethod();
        product.foo();
    }
}
