public class Solution {
    public String reverseOnlyLetters(String s) {
        char []str =s.toCharArray();
        int start = 0;
        int end = str.length -1;
        while(start <= end){
            if(!Character.isAlphabetic(str[start])){
                start++;
            }else if(!Character.isAlphabetic(str[end])){
                end--;
            }else{
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start ++;
                end--;
            }
        }
        return new String(str);
    }
}
