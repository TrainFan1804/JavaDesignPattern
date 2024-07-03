package main.patterns.behavioralpatterns.command;

/**
 * This class receive the signal from the {@link Command} type.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.9
 */
class Receiver {

    /**
     * Execute action one.
     */
    void actionOne() {

        System.out.println("Execute action one");
    }

    /**
     * Execute action two.
     */
    void actionTwo() {

        System.out.println("Execute action two");
    }
}
