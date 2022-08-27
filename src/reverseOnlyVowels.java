public class reverseOnlyVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        String str = reverseVowels(s);
        System.out.println(str);
    }

    public static String reverseVowels(String s) {
        char []arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            while(start < end && isVowel(arr,start) == false){
                start ++;
            }
            while(start < end && isVowel(arr,end) == false){
                end --;
            }

            swap(arr,start,end);

            start++;
            end--;
        }

        return new String(arr);
    }

    public static boolean isVowel(char []arr, int i){
        char ch = arr[i];

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){
            return true;
        }
        return false;
    }

    public static void swap(char []arr, int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

