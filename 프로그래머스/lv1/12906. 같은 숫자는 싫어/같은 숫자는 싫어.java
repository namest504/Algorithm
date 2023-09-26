import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack<>();
        
        for(Integer value : arr){
            if(!st.isEmpty()){
                if(st.peek()!=value){
                    st.push(value);
                }
            } else{
                st.push(value);
            }
        }
        
        int[] answer = new int[st.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = st.get(i);
        }
        return answer;
    }
}