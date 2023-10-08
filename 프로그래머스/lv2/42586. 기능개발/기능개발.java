import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            que.offer( (int) Math.ceil((100.0 - progresses[i]) / speeds[i]) );
        }
        
        int count;
        while(!que.isEmpty()){
            int i = que.poll();
            count = 1;
            while(!que.isEmpty() && i >= que.peek()){
                que.poll();
                count++;
            }
            
            answer.add(count);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}