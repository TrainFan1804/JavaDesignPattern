package behavioral.visitor;

/**
 * The visitor pattern allow the user to add new functionality without changing
 * the old classes. The visitor can visit subtypes of {@link Element}. This class
 * is inside the old system that want to be expanded.
 * <p>
 * It's a <b>GoF</b> pattern. For more information: 
 * https://en.wikipedia.org/wiki/Visitor_pattern.
 * 
 * @author                              o.le
 * @version                             0.4
 * @since                               0.1
 */
public interface Visitor {

    /**
     * Add a element the visitor should visit.
     * 
     * @param element                   The visiting element.
     */
    void visitElement(Element element);
}
