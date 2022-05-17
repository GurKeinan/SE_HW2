public class IntegerLiteral extends Expression{

    private int val;

    public IntegerLiteral(int val){
        this.val = val;
    }

    public double evaluate(){
        return (double)this.val;
    }

    public String toString(){
        return "(" + this.val + ")";
    }
}
