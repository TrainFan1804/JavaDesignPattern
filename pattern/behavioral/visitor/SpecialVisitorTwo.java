package behavioral.visitor;

/**
 * This type is a special visitor that provide new functionality. This class
 * is inside the new system. This special visitor provide a method to do
 * something you couldn't do with the old system without chaning it.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.17
 */
class SpecialVisitorTwo implements Visitor {

    @Override
    public void visitElement(Element element) {
     
        System.out.println(element.name);
    }
}
