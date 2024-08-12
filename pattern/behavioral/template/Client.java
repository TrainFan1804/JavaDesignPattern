package behavioral.template;

class Client {

    public static void main(String[] args) {
       
        AbstractClass c = new ConcreteClass();
        c.template();
    }
}
