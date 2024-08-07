package main.patterns.behavioralpatterns.strategy;

class Client {

    Strategy strategy = new ConcreteStrategy();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.strategy.execute();
    }
}
