public class SolutionToReverseStringTwo{
    public String reverseStr(String s, int k) {
        char []arr = s.toCharArray();
        for(int i = 0; i < s.length();i= i+(2*k)){
            int start = i;
            int right = Math.min(i+k, s.length())-1;
            char temp;
            while(start < right){
                temp = arr[start];
                arr[start] = arr[right];
                arr[right] = temp;
                start++;
                right--;
            }
        }
        return new String(arr);
    }
}
