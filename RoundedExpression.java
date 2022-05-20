public class RoundedExpression extends Expression{
    private Expression exp;
    int round;

    /**
     * constructor for new RoundedExpression
     * @param expression- the expression we're rounding
     * @param round- number of decimal places after the dot we are rounding to
     */
    public RoundedExpression(Expression expression, int round)
    {
        this.exp = expression;
        this.round = round;
    }


    /**
     * toString method for RoundedExpression
     * @return string in format "(exp1)" when exp1 is the toString of exp
     */
    public String toString(){
        return "(" + exp.toString() + ")";
    }

    /**
     * evaluate method for RoundedExpression
     * multiplied by 10^round and then round it with Math.round, then divided by 10^round
     * @return the rounded value
     */
    public double evaluate(){
        double temp1 = this.exp.evaluate() ;
        double temp2 = temp1 * Math.pow(10 , round);
        double temp3 = Math.round(temp2);
        double temp4 = temp3/Math.pow(10 , round);
        return temp4;
    }
}
