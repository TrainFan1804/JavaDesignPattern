package main.patterns.behavioralpatterns.command;

/**
 * This type represent the client that use different {@link Command}.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.9
 */
class Client {

    private Command cmd = new CommandOne();

    public static void main(String[] args) {
        
        Client client = new Client();

        for(int i = 0; i <= 2; i++) {

            client.cmd.execute();
        }
    }
}
