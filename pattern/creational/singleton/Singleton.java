package creational.singleton;

class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstace() { return Singleton.singleton; }
}
