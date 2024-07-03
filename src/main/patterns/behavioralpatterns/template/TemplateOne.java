package main.patterns.behavioralpatterns.template;

/**
 * This is a subtype of the {@link Template}.
 * 
 * @author                              o.le
 * @version                             0.2
 * @since                               0.17
 */
class TemplateOne extends Template {

    @Override
    protected void doSomething() {
        
        System.out.println("Do something");
    }

    @Override
    protected void doSomethingElse() {
     
        System.out.println("Do something else");   
    }
}
