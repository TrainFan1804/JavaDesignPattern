package structural.adapter;

class Client {

    public static void main(String[] args) {
       
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
