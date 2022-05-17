public class Addition extends Expression {
    private Expression exp1;
    private Expression exp2;

    public Addition(Expression exp1, Expression exp2)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public double evaluate(){
        return exp1.evaluate() + exp2.evaluate();
    }

    public String toString(){
        return "(" + exp1.toString() + " + " + exp2.toString() + ")";
    }


}
