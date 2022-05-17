public class DoubleLiteral extends Expression {

    private double val;

    public DoubleLiteral(double val){
        this.val = val;
    }

    public double evaluate(){
        return this.val;
    }

    public String toString(){
        return "(" + this.val + ")";
    }
}

