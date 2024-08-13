package structural.flyweight;

class Client {

    public static void main(String[] args) {
      
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight(5);
        System.out.println(flyweight.operation());
    }
}
