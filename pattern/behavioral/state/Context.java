package behavioral.state;

class Context {

    private State state;

    public Context(State initState) {

        this.state = initState; 
    }

    public void request() { this.state.handle(); }

    public void changeState(State state) { this.state = state; }
}
