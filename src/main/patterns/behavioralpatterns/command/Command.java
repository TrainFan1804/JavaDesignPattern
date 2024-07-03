package main.patterns.behavioralpatterns.command;

/**
 * The command pattern is used when you need to perform a specififc action. All
 * actions can also trigger an action later.
 * <p>
 * For more information: https://en.wikipedia.org/wiki/Command_pattern.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.1
 */
public interface Command {

    /**
     * Execute the saved command.
     */
    void execute();   
}
