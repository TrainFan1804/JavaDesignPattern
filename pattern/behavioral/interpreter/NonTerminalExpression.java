package behavioral.interpreter;

class NonTerminalExpression implements AbstractExpression {

    private AbstractExpression expression;

    public NonTerminalExpression(AbstractExpression expression) {

        this.expression = expression;
    }

    @Override
    public boolean interpret(Case context) {
        
        return this.expression.interpret(context); 
    }
}
