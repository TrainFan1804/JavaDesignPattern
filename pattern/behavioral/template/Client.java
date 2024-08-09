package behavioral.template;

/**
 * This type represent the client that use a {@link Template}.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.17
 */
class Client {

    private Template template = new TemplateOne();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.template.templateMethod();
    }
}
