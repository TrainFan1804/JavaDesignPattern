package behavioral.observer;

class Client {

    public static void main(String[] args) {
        
        Subject subject = new ConcreteSubject();
        subject.register(new ConcreteObserver());
        subject.notifyObserver();
    }
}
