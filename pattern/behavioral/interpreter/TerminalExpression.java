package behavioral.interpreter;

class TerminalExpression implements AbstractExpression {

    private String data;

    public TerminalExpression(String data) {

        this.data = data;
    }

    @Override
    public boolean interpret(Case context) {

        switch (context) {
            case LOWER: return this.countLowerCase() > this.countUpperCase();
            case UPPER: return this.countLowerCase() < this.countUpperCase();
        }

        return false;
    }

    private int countLowerCase() {

        return (int) this.data.chars()
                            .filter((c) -> Character.isLowerCase(c))
                            .count();
    }
    
    private int countUpperCase() {

        return (int) this.data.chars()
                            .filter((c) -> Character.isUpperCase(c))
                            .count();
    }
}
