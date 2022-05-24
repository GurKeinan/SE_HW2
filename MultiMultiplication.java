public class MultiMultiplication extends Expression{
    private Expression exp[];
    private int length;

    /**
     * constructor for new MultiMultiplication
     * @param expression- array of expression we want to multiply
     */
    public MultiMultiplication(Expression expression1, Expression expression2, Expression ...expression){
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
     * evaluate method for MultiMultiplication
     * @return the multiplication of exp- all of the given expressions
     */
    public double evaluate() {
        int product = 1;
        for(int i = 0; i < this.length; i++)
        {
            product *= exp[i].evaluate();
        }
        return product;
    }

    /**
     * toString method for MultiMultiplication
     * @return string in format "(exp11 * exp22 * ... * expnn) when n is the number of summed expressions and expii is
     * the toString of the i multiplied expression
     */
    public String toString(){
        String s = "(" + exp[0].toString();
        for(int i = 1; i < this.length; i++)
        {
            s += " * " + exp[i].toString();
        }

        return s + ")";
    }
}
