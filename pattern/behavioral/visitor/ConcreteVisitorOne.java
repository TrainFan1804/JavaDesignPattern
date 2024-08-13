package behavioral.visitor;

class ConcreteVisitor implements Visitor {

    @Override
    public void visitElement(ConcreteElement element) { 
        
        System.out.println("Do something special with " + element.getClass());
     }
}
