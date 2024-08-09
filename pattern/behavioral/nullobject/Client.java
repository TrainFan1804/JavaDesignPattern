package behavioral.nullobject;

class Client {

    public static void main(String[] args) {

        foo(new ConcreteObject());
        foo(new NullObject());
    }

    public static void foo(AbstractObject object) {

        // dont need to do a null check because of the Null-Object-Pattern
        object.operation();
    }
}
