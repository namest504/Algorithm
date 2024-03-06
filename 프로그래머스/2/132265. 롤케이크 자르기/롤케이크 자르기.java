import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> o = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();
        
        for(int t : topping){
            o.put(t, o.getOrDefault(t, 0) + 1);
        }
        
        for(int t : topping){
            y.put(t, y.getOrDefault(t, 0) + 1);
            
            if(o.get(t) == 1){
                o.remove(t);
            } else {
                o.put(t, o.get(t) - 1);                
            }
            
            if(o.size() == y.size()){
                answer++;
            }
        }
        return answer;
    }
}