package structural.composite;

/**
 * This type represent the client that use a {@link Component}. A component can
 * be a {@link Leaf} or {@link Composite}.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.13
 */
class Client {

    private Composite root = new Composite();

    public static void main(String[] args) {
        
        Client client = new Client();
        client.root.addChild(new Leaf());
        client.root.addChild(new Composite());
        ((Composite)client.root.getChild(1)).addChild(new Leaf());
    }
}
