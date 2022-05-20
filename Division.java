public class Division extends Expression{
    private Expression exp1;
    private Expression exp2;

    /**
     * constructor for new Division
     * @param exp1- first expression in the new Division
     * @param exp2- second expression in the new Division
     */
    public Division(Expression exp1, Expression exp2)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    /**
     * evaluate for Division
     * @return the value of the addition- the first exp value divided by the second's
     */
    public double evaluate(){
        return exp1.evaluate()/exp2.evaluate();
    }

    /**
     * toString for Division
     * @return string in "(exp1 / exp2)"  format when exp1 is the first exp toString and exp2 is the second's
     */
    public String toString(){
        return "(" + exp1.toString() + " / " + exp2.toString() + ")";
    }
}


