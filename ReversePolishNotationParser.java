public class ReversePolishNotationParser extends ExpressionParser {


    public ReversePolishNotationParser(){

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
        else if(arr[arr.length - 1].equals("-u"))
        {
            return new UnaryMinus(parse(s.substring(0, s.length() - 3)));
        }

        if(arr[arr.length - 1].equals("+")){
            int index = Find_Separation(s);
            return new Addition(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
        }

        else if(arr[arr.length - 1].equals("*")){
            int index = Find_Separation(s);

            return new Multiplication(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
        }
        else if(arr[arr.length - 1].equals("-")){
            int index = Find_Separation(s);

            return new Subtraction(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
        }
        else {
            int index = Find_Separation(s);

            return new Division(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
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


    public int Find_Separation(String s)
    {
        String[] string_array = s.split(" ");
        int op_count = 1;
        int num_count = 0;
        int i = string_array.length - 2;

        while(num_count < op_count)
        {
            if (isNumber(string_array[i])) num_count++;
            else if (!(string_array[i].equals("-u"))) op_count++;
            i--;
        }
        return i + 1;
    }


    public String ret_str1(String[] arr_s , int index)
    {
        String[] arr_ret = new String[index];
        for (int i = 0 ; i < index ; i++)
        {
            arr_ret[i] = arr_s[i];
        }
        String ret_s = String.join(" " , arr_ret);
        return ret_s;
    }

    public String ret_str2(String[] arr_s , int index)
    {
        String[] arr_ret = new String[arr_s.length-index-1];
        for (int i = index ; i < arr_s.length - 1 ; i++)
        {
            arr_ret[i-index] = arr_s[i];
        }
        String ret_s = String.join(" " , arr_ret);
        return ret_s;
    }


}
