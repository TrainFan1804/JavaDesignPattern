package main.patterns.creationalpatterns.builder;

class ComplexObject {

    private Object firstPart;
    private Object secondPart;
    
    public void setFirstPart(Object firstPart) { this.firstPart = firstPart; }
    
    public void setSecondPart(Object secondPart) { this.secondPart = secondPart; }

    @Override
    public String toString() {
    
        return "firstPart = " + firstPart + ", secondPart = " + secondPart;
    }
}
