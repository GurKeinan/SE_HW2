public class UnaryMinus extends Expression{
    private Expression exp;

    /**
     * constructor for new UnaryMinus
     * @param exp- the expression we're doing the UnaryMinus on
     */
    public UnaryMinus(Expression exp)
    {
        this.exp = exp;
    }

    /**
     * evaluate for UnaryMinus
     * @return the value of the UnaryMinus- 0 minus the exp's value
     */
    public double evaluate(){
        return -1*exp.evaluate();
    }

    /**
     * toString for UnaryMinus
     * @return string in "(-(exp1))" format when exp1 is exp's toString
     */
    public String toString(){
        return "(-" + exp.toString() + ")";
    }
}
