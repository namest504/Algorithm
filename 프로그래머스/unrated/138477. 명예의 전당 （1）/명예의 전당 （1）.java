import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // int[] answer = {};
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int sc : score){
            if(que.isEmpty()) que.add(sc);
            else{
                if(que.size() < k) que.add(sc);
                else{
                    if(que.peek() < sc){
                        que.poll();
                        que.add(sc);
                    }
                }
            }
            answer.add(que.peek());
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}