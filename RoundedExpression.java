public class RoundedExpression extends Expression{
    private Expression exp;
    int round;

    public RoundedExpression(Expression expression, int round)
    {
        this.exp = expression;
        this.round = round;
    }



    public String toString(){
        return "(" + exp.toString() + ")";
    }

    public double evaluate(){
        double temp1 = this.exp.evaluate() ;
        double temp2 = temp1 * Math.pow(10 , round);
        double temp3 = Math.round(temp2);
        double temp4 = temp3/Math.pow(10 , round);
        return temp4;
    }
}
