import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            pq.add(work);
        }
        
        int max = -1;
        for(; n > 0; n--){
            max = pq.poll();
            if(max == 0){
                break;
            } else{
                pq.add(max-1);
            }
        }
        
        while(!pq.isEmpty()){
            max = pq.poll();
            answer += (max * max);
        }
        return answer;
    }
}