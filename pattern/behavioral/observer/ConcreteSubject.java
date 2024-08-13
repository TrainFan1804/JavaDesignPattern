package behavioral.observer;

// java import
import java.util.List;
import java.util.LinkedList;

class ConcreteSubject implements Subject {

    private List<Observer> oberserver = new LinkedList<>();

    public void register(Observer observer) {

        this.oberserver.add(observer);
        observer.setSubject(this);
    }

    public void notifyObserver() {

        this.oberserver.stream()
                        .forEach(o -> o.update());
    }
}
