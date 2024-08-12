package structural.composite;

class Client {

    public static void main(String[] args) {
     
        Composite root = new Composite();
        root.addChild(new Leaf());
        root.addChild(new Composite());
        ((Composite) root.getChild(1)).addChild(new Leaf());
        root.operation();
    }
}
