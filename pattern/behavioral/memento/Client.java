package behavioral.memento;

class Client {

    public static void main(String[] args) {
        
        Originator originator = new Originator(5);
        Memento copy = originator.createMemento();
        originator.setData(10);
        
        System.out.println("Data of originator after change: " 
                            + originator.getData());

        originator.restore(copy);
        System.out.println("Data of originator after restore: "
                            + originator.getData());
    }
}
