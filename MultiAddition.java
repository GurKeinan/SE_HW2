public class MultiAddition extends Expression{
    private Expression exp[];
    int length;

    /**
     * constructor for new MultiAddition
     * @param expression- array of expression we want to sum
     */
    public MultiAddition(Expression ...expression){
        this.length = expression.length;
        exp = new Expression[this.length];
        for(int i = 0; i < this.length; i++)
        {
            exp[i] = expression[i];
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
