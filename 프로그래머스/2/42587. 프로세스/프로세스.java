
import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pQue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            pQue.add(i);
        }
        
        while(!pQue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pQue.peek() == priorities[i]){
                    pQue.poll();
                    answer++;
                    
                    if(i == location){
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}