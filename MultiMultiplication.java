public class MultiMultiplication extends Expression{
    private Expression exp[];
    int length;

    /**
     * constructor for new MultiMultiplication
     * @param expression- array of expression we want to multiply
     */
    public MultiMultiplication(Expression ...expression){
        this.length = expression.length;
        exp = new Expression[this.length];
        for(int i = 0; i < this.length; i++)
        {
            exp[i] = expression[i];
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
