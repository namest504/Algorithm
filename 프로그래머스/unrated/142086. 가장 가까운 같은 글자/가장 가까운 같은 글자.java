import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] cArr = new int[128];
        Arrays.fill(cArr, -1);
        
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(cArr[c] >= 0){
                answer[i] = i - cArr[c];
            } else{
                answer[i] = -1;
            }
            cArr[c] = i;
        }
        
        return answer;
    }
}