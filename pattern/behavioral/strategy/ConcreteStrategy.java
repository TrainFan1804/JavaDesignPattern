package behavioral.strategy;

class ConcreteStrategy implements Strategy {

    @Override
    public void execute() {
        
        System.out.println("This special algorithm will be executed");
    }
}
