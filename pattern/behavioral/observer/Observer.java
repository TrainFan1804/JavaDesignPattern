package behavioral.observer;

/**
 * The obsever pattern is usefull when you need object that must react on a
 * specific event. The oberserver will be notified by an {@link Subject} when an
 * event is happening. So the obeserver 'wait' that an event in subject is
 * happening.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Observer_pattern.
 * 
 * @author                              o.le
 * @version                             0.7
 * @since                               0.14
 */
public class Observer {

    private Subject subject;

    /**
     * Set the subject the observer is looking at.
     * 
     * @param subject                   The observed subject.
     */
    void setSubject(Subject subject) {

        this.subject = subject;
    }

    /**
     * Update the observer state. Should also update the subject itself.
     */
    void update() {

        System.out.println("Observer is called from subject: " + this.subject);
    }
}
