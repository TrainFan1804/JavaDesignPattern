package behavioral.observer;

class ConcreteObserver implements Observer {

    private Subject subject;

    public void setSubject(Subject subject) { this.subject = subject; }

    public void update() {

        System.out.println("Observer is called from subject: " + this.subject);
    }
}
