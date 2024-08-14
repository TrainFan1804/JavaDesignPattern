package behavioral.interpreter;

class Client {

    public static void main(String[] args) {
        
        AbstractExpression terminalExpression
                            = new TerminalExpression("Interpreter Pattern");
        AbstractExpression nonTerminalExpression
                            = new NonTerminalExpression(terminalExpression);

        System.out.println(nonTerminalExpression.interpret(Case.LOWER));
    }
}
