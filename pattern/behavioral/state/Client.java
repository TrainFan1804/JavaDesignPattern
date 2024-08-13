package behavioral.state;

class Client {

    public static void main(String[] args) {
       
        Context context = new Context(new ConcreteState());
        context.request();
    }
}
