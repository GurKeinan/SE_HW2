public class IntegerLiteral extends Expression{

    private int val;

    /**
     * constructor for  IntegerLiteral
     * @param val the value that is to become val class variable
     */
    public IntegerLiteral(int val){
        this.val = val;
    }

    /**
     * evaluate for IntegerLiteral
     * @return value of this IntegerLiteral
     */
    public double evaluate(){
        return (double)this.val;
    }

    /**
     * toString for IntegerLiteral
     * @return String containing value of integer in parentheses
     */
    public String toString(){
        return "(" + this.val + ")";
    }
}
