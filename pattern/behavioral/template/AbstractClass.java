package behavioral.template;

abstract class AbstractClass {

    public void template() {

        this.operationOne();
        this.operationTwo();
    }

    public abstract void operationOne();

    public abstract void operationTwo();
}
