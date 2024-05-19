import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> sub = new Stack<>();
        
        int idx = 0;
        for(int i = 1; i < order.length+1; i++){
            sub.add(i);
            while(!sub.isEmpty()){
                if(sub.peek() == order[idx]){
                    sub.pop();
                    idx++;
                    answer++;
                } else {
                    break;
                }
            }
        }
        
        return answer;
    }
}