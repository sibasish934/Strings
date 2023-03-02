class Solution {
    public int compress(char[] chars) {
        StringBuilder sb  = new StringBuilder();
        if( chars.length == 1){
            return chars.length;
        }
        int count = 1;
        sb.append(chars[0]);
        for(int i = 1; i< chars.length; i++){
            char curr = chars[i];
            char prev = chars[i-1];

            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    sb.append(count);
                    count = 1;
                }
                sb.append(curr);
            }
        }

        if(count > 1){
            sb.append(count);
            count = 1;
        }

        for(int i = 0; i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    } 
}
