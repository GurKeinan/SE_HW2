public class PolishNotationParser extends ExpressionParser {


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
        else if(arr[0].equals("-u"))
        {
            return new UnaryMinus(parse(s.substring(3)));
        }

        if(arr[0].equals("+")){
            int index = Find_Separation(s);

            return new Addition(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
            }

        else if(arr[0].equals("*")){
            int index = Find_Separation(s);

            return new Multiplication(parse(ret_str1(arr,index)),parse(ret_str2(arr,index)));
        }
        else if(arr[0].equals("-")){
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
        int op_count = 0;
        int num_count = 0;
        int i = 1;

        while(num_count <= op_count)
        {
            if (isNumber(string_array[i])) num_count++;
            else op_count++;
            i++;
        }
        return i-1;
    }

    public String ret_str1(String[] arr_s , int index)
    {
        String[] arr_ret = new String[index];
        for (int i = 1 ; i <= index ; i++)
        {
            arr_ret[i-1] = arr_s[i];
        }
        String ret_s = String.join(" " , arr_ret);
        return ret_s;
    }

    public String ret_str2(String[] arr_s , int index)
    {
        String[] arr_ret = new String[arr_s.length-index-1];
        for (int i = index+1 ; i < arr_s.length ; i++)
        {
            arr_ret[i-index-1] = arr_s[i];
        }
        String ret_s = String.join(" " , arr_ret);
        return ret_s;
    }





}
