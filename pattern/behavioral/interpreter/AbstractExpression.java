package behavioral.interpreter;

interface AbstractExpression {

    boolean interpret(Case Context);
}

enum Case {

    LOWER,
    UPPER;
}