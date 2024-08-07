package main.patterns.creationalpatterns.singleton;

class Client {

    public static void main(String[] args) {
        
        Singleton singletonOne = Singleton.getInstace();
        Singleton singletonTwo = Singleton.getInstace();

        System.out.println(singletonOne == singletonTwo);
    }
}
