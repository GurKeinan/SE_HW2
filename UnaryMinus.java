public class UnaryMinus extends Expression{
    private Expression exp;

    public UnaryMinus(Expression exp)
    {
        this.exp = exp;
    }

    public double evaluate(){
        return -1*exp.evaluate();
    }

    public String toString(){
        return "(-" + exp.toString() + ")";
    }
}
