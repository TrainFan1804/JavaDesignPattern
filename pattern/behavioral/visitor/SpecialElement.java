package behavioral.visitor;

/**
 * This type is a special element that is expand with new features. This class
 * is inside the old system that want to be expanded.
 * 
 * @author                              o.le
 * @version                             0.3
 * @since                               0.17
 */
class SpecialElement extends Element {

    @Override
    void accept(Visitor visitor) {

        visitor.visitElement(this);
    }
}
