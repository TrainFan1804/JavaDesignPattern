package behavioral.observer;

// java import
import java.util.List;
import java.util.LinkedList;

/**
 * A subject is a type that can be observed by several {@link Observer}. When
 * the state if this type changes the observer will be notified and handle the
 * upcoming event.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.16
 */
class Subject {

    private List<Observer> oberserver = new LinkedList<>();

    /**
     * Attach an observer to the subject.
     * 
     * @param o                         The attached observer.
     */
    void attach(Observer o) {

        this.oberserver.add(o);
        o.setSubject(this);
    }

    /**
     * Notify all observer the subject has saved.
     */
    void notifyObserver() {

        this.oberserver.stream()
                        .forEach(o -> o.update());
    }
    
    // method for removing an object would be usefull

}
