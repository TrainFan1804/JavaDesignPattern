package structural.proxy;

class Proxy implements Subject {

    private Subject realSubject;
    
    @Override
    public void request() {

        if (this.realSubject == null) {
            
            this.realSubject = new RealSubject();
            System.out.println("Real subject was created!");
        }

        this.realSubject.request();
    }
}
