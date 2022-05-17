public class PolishNotationParser {


    public PolishNotationParser(){

    }

    public Expression parse(String s){
        String [] arr = s.split(" ");
        if(arr.length == 1)
        {
            if(isDouble(arr[0])){
                return new DoubleLiteral(Double.parseDouble(arr[0]));
            }
            else{
                return new IntegerLiteral(Integer.parseInt(arr[0]));
            }
        }
        else if(arr.length == 2) {
            if (isDouble(arr[0])) {
                return new UnaryMinus(new DoubleLiteral(Double.parseDouble(arr[1])));
            } else {
                return new UnaryMinus(new IntegerLiteral(Integer.parseInt(arr[1])));
            }
        }
        if(arr[0].charAt(0) == '+'){
            if((isNumber(arr[-3])||(arr[-3] == "-u"))&&((isNumber(arr[-1]))&&(isNumber(arr[-2])))) {
                if (isDouble(arr[-1])) {
                    return new Addition(parse(s.substring(1, s.length() - arr[-1].length()))
                            , new DoubleLiteral(Double.parseDouble(arr[0])));
                } else {
                    return new Addition(parse(s.substring(1, s.length() - arr[-1].length()))
                            , new IntegerLiteral(Integer.parseInt(arr[0])));
                }
            }
            else if(arr[-3] == "+"){
                return new Addition()
            }
        }
        else if(arr[0].charAt(0) == '*'){
            if(isDouble(arr[-1])) {
                return new Multiplication(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new DoubleLiteral(Double.parseDouble(arr[0])));
            }
            else{
                return new Multiplication(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new IntegerLiteral(Integer.parseInt(arr[0])));
            }
        }
        else if(arr[0].charAt(0) == '-'){
            if(isDouble(arr[-1])) {
                return new Subtraction(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new DoubleLiteral(Double.parseDouble(arr[0])));
            }
            else{
                return new Subtraction(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new IntegerLiteral(Integer.parseInt(arr[0])));
            }
        }
        else if(arr[0].charAt(0) == '/'){
            if(isDouble(arr[-1])) {
                return new Division(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new DoubleLiteral(Double.parseDouble(arr[0])));
            }
            else{
                return new Division(parse(s.substring(1,s.length() - arr[-1].length()))
                        ,new IntegerLiteral(Integer.parseInt(arr[0])));
            }
        }
    }

    public boolean isDouble(String s)
    {
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    public boolean isNumber(String c){
        if(((int)c.charAt(0) >= 48) && ((int)c.charAt(0) <= 57)){
            return true;
        }
        return false;
    }

}
