import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            int times = food[i] / 2;
            for(int j = 0; j < times; j++){
                sb.append(i);
            }
        }
        
        String sr = sb.reverse().toString();
        sb.reverse().append("0").append(sr);    
        return sb.toString();
    }
    
}