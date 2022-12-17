class Solution {
    public List<Integer> partitionLabels(String s) {
        int []lastIndex = new int [26];
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int j = 0;
        for(int i = 0; i< s.length(); i++){
             j = Math.max(j , lastIndex[s.charAt(i) - 'a']);
            if(i == j){
                list.add(i- start + 1);
                start = i + 1;
            }
        }

        return list;
    }
}
