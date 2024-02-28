import java.util.*;
class Solution {

    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> enter = new HashMap<>();
        Map<String, Integer> rec = new HashMap<>();
        List<String> keys = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(String record : records){
            String[] data = record.split(" ");
            int time;
            String[] times = data[0].split(":");
            time = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
            
            if(data[2].equals("IN")){
                enter.put(data[1], time);
            } else {
                int term = time - enter.get(data[1]);
                rec.put(data[1], rec.getOrDefault(data[1], 0) + term);
                enter.remove(data[1]);
            }
        }
        
        // 마지막 출차 기록 없는 차량
        int lastTime = 23 * 60 + 59;
        for(String k : enter.keySet()){
            int term = lastTime - enter.get(k);
            rec.put(k, rec.getOrDefault(k, 0) + term);
        }
        
        for(String k : rec.keySet()){
            keys.add(k);
        }
        Collections.sort(keys);
        
        for(String k: keys){
            int cost = fees[1];
            if(rec.get(k) > fees[0]){
                int usedTime = rec.get(k) - fees[0];
                if(usedTime % fees[2] > 0){
                    cost += ((usedTime / fees[2]) + 1) * fees[3];
                }else{
                    cost += (usedTime / fees[2]) * fees[3];
                }
            } 
            result.add(cost);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}