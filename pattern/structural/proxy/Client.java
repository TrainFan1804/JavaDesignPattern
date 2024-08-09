package structural.proxy;

class Client {

    public static void main(String[] args) {
        
        Subject subject = new Proxy();
        subject.request();
        subject.request();
    }
}
