package main.patterns.behavioralpatterns.iterator;

/**
 * This type represent the client.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.18
 */
class Client {

    SpecialAggregate specialAggregate = new SpecialAggregate();

    public static void main(String[] args) {
     
        Client client = new Client();

        Iterator iter = client.specialAggregate.createIterator();

        while (iter.hasNext()) {
            
            System.out.println(iter.next());
        }
    }
}
