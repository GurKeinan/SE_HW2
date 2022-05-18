public class MultiAddition extends Expression{
    private Expression exp[];
    int length;
    public MultiAddition(Expression ...expression){
        this.length = expression.length;
        exp = new Expression[this.length];
        for(int i = 0; i < this.length; i++)
        {
            exp[i] = expression[i];
        }

    }

    public double evaluate() {
        double sum = 0;
        for(int i = 0; i < this.length; i++)
        {
            sum += exp[i].evaluate();
        }
        return sum;
    }

    public String toString(){
        String s = "(" + exp[0].toString();
        for(int i = 1; i < this.length; i++)
        {
            s += " + " + exp[i].toString();
        }

        return s + ")";
    }
}
