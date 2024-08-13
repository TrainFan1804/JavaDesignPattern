package behavioral.state;

class ConcreteState implements State {

    @Override
    public void handle() { System.out.println("Do something.."); }
}
