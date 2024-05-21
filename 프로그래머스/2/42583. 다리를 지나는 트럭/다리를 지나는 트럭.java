import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> cross = new LinkedList<>();
        
        int cur = 0;
        for(int truck : truck_weights){
            while(true){
                if(cross.isEmpty()){
                    cross.add(truck);
                    cur += truck;
                    answer++;
                    break;
                } else {
                    if(cross.size() == bridge_length){
                        cur -= cross.poll();
                    } else if ( cur + truck > weight) {
                        cross.add(0);
                        answer++;
                    } else {
                        cross.add(truck);
                        cur += truck;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}