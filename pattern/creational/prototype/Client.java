package creational.prototype;

class Client {

    public static void main(String[] args) {
     
        Prototype p1 = new ConcretePrototype(5);
        
        Prototype p2 = p1.clone();

        // p1 and p2 are two different objects
        System.out.println(p1.equals(p2));
    }
}
