import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hMap = new HashMap<>();
        String answer = "";
        for(String value : participant){
            hMap.put(value, hMap.getOrDefault(value, 0)+1);
        }
        for(String value : completion){
            hMap.put(value, hMap.get(value) - 1);
        }
        for(String value : hMap.keySet()){
            if(hMap.get(value) != 0){
                answer = value;
                break;
            }
        }
        return answer;
    }
}