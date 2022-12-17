import java.util.Stack;
public class reversePolishNotation {
    public static void main(String[] args) {
        String []tokens = {"4","13","5","/","+"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }
    public static int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i< tokens.length; i++){
            if(isNumeric(tokens[i])){
                st.push(Integer.parseInt(tokens[i]));
            }else if(isOperator(tokens[i])){
                int x = st.pop();
                int y = st.pop();
//                System.out.println(x + " " + y);
                int token = getoperatortoken(tokens[i]);
//                System.out.println(token);
                if(token == 1){
                    int quo = y / x;
                    st.push(quo);
                }else if(token == 2){
                    int product = x * y;
                    st.push(product);
                }else if(token == 3){
                    int sum = x + y;
                    st.push(sum);
                }else if(token == 4){
                    int diff = y - x;
                    st.push(diff);
                }
            }
        }
        return st.pop();
    }

    public static boolean isOperator(String str){
        if(str == "+" || str == "*" || str == "/" || str == "-"){
            return true;
        }
        return false;
    }

    public static boolean isNumeric(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }

    public static int getoperatortoken(String str){
        int index = 0;
        switch(str){
            case "/":
                index = 1;
                break;

            case "*":
                index = 2;
                break;

            case "+":
                index = 3;
                break;

            case "-":
                index = 4;
                break;
        }
        return index;
    }
}
