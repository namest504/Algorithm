import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> hmap = new HashMap<>();
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                hmap.put(key.substring(i,i+1), Math.min(hmap.getOrDefault(key.substring(i,i+1), i+1), i+1));
            }
        }
        
        
        for(String target : targets){
            int count = 0;
            for(int i = 0; i < target.length(); i++){
                if(hmap.containsKey(target.substring(i,i+1))){
                    count += hmap.get(target.substring(i,i+1));
                } else{
                    count = -1;
                    break;
                }
            }
            answer.add(count);
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
    
    
}