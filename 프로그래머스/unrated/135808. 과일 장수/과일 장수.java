import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int idx = score.length;
        for(int i = 0; i < score.length/m; i++){
            idx -= m;
            if(idx < 0) break;
            
            answer += score[idx] * m;
        }
        return answer;
    }
}