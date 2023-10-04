import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQue = new PriorityQueue<>();
        
        for(int scov : scoville){
            pQue.add(scov);
        }
        
        while(pQue.peek() < K) {
            if (pQue.size() == 1)
                return -1;
            pQue.add(pQue.poll() + pQue.poll() * 2);
            answer++;
        }
        return answer;
    }
}