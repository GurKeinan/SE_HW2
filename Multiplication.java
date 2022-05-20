public class Multiplication extends Expression{
    private Expression exp1;
    private Expression exp2;

    /**
     * constructor for new Multiplication
     * @param exp1- first expression in the new Multiplication
     * @param exp2- second expression in the new Multiplication
     */
    public Multiplication(Expression exp1, Expression exp2)
    {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    /**
     * evaluate for Multiplication
     * @return the value of the addition- the first exp value multiplied by the second's
     */
    public double evaluate(){
        return exp1.evaluate() * exp2.evaluate();
    }

    /**
     * toString for Multiplication
     * @return string in "(exp1 * exp2)"  format when exp1 is the first exp toString and exp2 is the second's
     */
    public String toString(){
        return "(" + exp1.toString() + " * " + exp2.toString() + ")";
    }
}





