class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        String str1 = "";
        Stack<Character> st = new Stack();
        for(int i= 0; i<str.length();i++){
            st.push(str.charAt(i));
        }
        
        while(!st.isEmpty()){
            str1 += st.pop();
        }
        
        return str1;
    }
    
}
