public class MultiAddition extends Expression{
    private Expression exp[];
    private int length;

    /**
     * constructor for new MultiAddition
     * @param expression- array of expression we want to sum
     */
    public MultiAddition(Expression expression1, Expression expression2, Expression...expression){
        this.length = expression.length + 2;
        exp = new Expression[this.length];
        exp[0] = expression1;
        exp[1] = expression2;
        for(int i = 0; i < this.length - 2; i++)
        {
            exp[i + 2] = expression[i];
        }
    }

    /**
     * evaluate method for MultiAddition
     * @return the sum of exp- all of the given expressions
     */
    public double evaluate() {
        double sum = 0;
        for(int i = 0; i < this.length; i++)
        {
            sum += exp[i].evaluate();
        }
        return sum;
    }

    /**
     * toString method for MultiAddition
     * @return string in format "(exp11 + exp22 + ... + expnn) when n is the number of summed expressions and expii is
     * the toString of the i summed expression
     */
    public String toString(){
        String s = "(" + exp[0].toString();
        for(int i = 1; i < this.length; i++)
        {
            s += " + " + exp[i].toString();
        }

        return s + ")";
    }
}
