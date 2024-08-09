package structural.bridge;

class ConcreteImplementor implements Implementor {

    private String string;
    
    public ConcreteImplementor(String string) { 

        this.string = string;
    }

    @Override
    public String implementation() {
    
        return this.string.toUpperCase();
    }
}
