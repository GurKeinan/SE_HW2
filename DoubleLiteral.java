public class DoubleLiteral extends Expression {

    private double val;

    /**
     * constructor for DoubleLiteral
     * @param val the value that is to become val class variable
     */
    public DoubleLiteral(double val){
        this.val = val;
    }

    /**
     * evaluate for DoubleLiteral
     * @return value of this DoubleLiteral
     */
    public double evaluate(){
        return this.val;
    }

    /**
     * toString for DoubleLiteral
     * @return String containing value of double in parentheses
     */
    public String toString(){
        return "(" + this.val + ")";
    }
}

