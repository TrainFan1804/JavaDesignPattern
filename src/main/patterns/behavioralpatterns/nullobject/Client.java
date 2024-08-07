package main.patterns.behavioralpatterns.nullobject;

class Client {

    public static void main(String[] args) {

        test(new ConcreteObject());
        test(new NullObject());
    }

    public static void test(AbstractObject object) {

        // dont need to do a null check because of the Null-Object-Pattern
        object.operation();
    }
}
