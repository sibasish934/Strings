class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i) , 1);
            }
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

      StringBuilder sb = new StringBuilder();
 
        while(!pq.isEmpty()) {
          char c = pq.remove();
 
          for(int i = 0; i < map.get(c); i++) {
              sb.append(c);
           }
        }
 
        return sb.toString();
    }
}
