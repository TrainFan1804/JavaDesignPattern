package structural.proxy;

class RealSubject implements Subject {

    @Override
    public void request() {
     
        System.out.println("The real subject is called!");
    }
}
