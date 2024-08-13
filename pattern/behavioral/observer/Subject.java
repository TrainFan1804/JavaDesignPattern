package behavioral.observer;

interface Subject {

    void register(Observer observer);

    void notifyObserver();
}
