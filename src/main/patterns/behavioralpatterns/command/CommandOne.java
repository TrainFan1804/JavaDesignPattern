package main.patterns.behavioralpatterns.command;

/**
 * This class implements the {@link Command} type. This command is used to send
 * an execute command to the {@link Receiver}.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.9
 */
class CommandOne implements Command {

    private Receiver receiver;
    private boolean state;

    CommandOne() {

        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        
        if (this.state) {

            this.receiver.actionTwo();
        } else {

            this.receiver.actionOne();
        }

        this.state = !this.state;
    }
}
