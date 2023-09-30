import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
        long start = times[0];
        long end = (long) times[times.length - 1] * (long) n;
        
        while(start <= end){
            long mid = (start + end) / 2;
            long people = 0;
            
            for(int time : times){
                people += mid / time;
                
                if(people >= n) break; 
            }
            if(people >= n){
                answer = Math.min(answer, mid);
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return answer;
    }
}