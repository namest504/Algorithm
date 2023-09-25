import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> hMap = new HashMap<>();
    
        for(String[] values : clothes){
            hMap.put(values[1], hMap.getOrDefault(values[1], 0) + 1);
        }
        for(String key : hMap.keySet()){
            if(answer == 0){
                answer += (hMap.get(key) + 1);
            } else{
                answer *= (hMap.get(key) + 1);
            }
        }
        
        return (answer - 1);
    }
}