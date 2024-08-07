package main.patterns.creationalpatterns.singleton;

class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstace() { return Singleton.singleton; }
}
