import java.util.*;
class Solution {
    Map<String, Integer> dict = new HashMap<>();
    
    public int[] solution(String msg) {
        // A ~ Z Map 에 저장
        for(int i = 0; i <= 'Z' - 'A'; i++){
            dict.put(String.valueOf((char)((int)'A'+i)), i+1);
        }
        int lastIdx = 26;
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < msg.length(); i++){
            int index = 0;
            String buffer = "";
            for(int j = i+1; j < msg.length() + 1; j++){
                buffer = msg.substring(i, j);
                if(getValue(buffer) != 0){
                    index = getValue(buffer);
                    if(j == msg.length()){
                        i = j;
                    }
                    continue;
                } else {
                    i = j - 2;
                    break;
                }
            }
            dict.put(buffer, ++lastIdx);
            result.add(index);
        }
        
        // result -> answer 변환
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    
    private int getValue(String str){
        return dict.getOrDefault(str, 0);
    }
    
    private void viewMap(){
        for(String k : dict.keySet()){
            System.out.println(k + " : " + dict.get(k));
        }
    }
}