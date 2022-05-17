public class RoundedExpression extends Expression{
    private Expression exp;
    int round;

    public RoundedExpression(Expression expression, int round)
    {
        this.exp = expression;
        this.round = round;
    }

    public double evaluate(){
        return exp.evaluate() - exp.evaluate() % Math.pow(0.1, this.round);
    }

    public String toString(){
        return "(" + exp.toString() + ")";
    }
}
