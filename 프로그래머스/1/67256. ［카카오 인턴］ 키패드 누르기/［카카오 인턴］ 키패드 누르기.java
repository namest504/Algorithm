import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                left = n;
                sb.append("L");
            } else if(n == 3 || n == 6 || n ==9) {
                right = n;
                sb.append("R");
            } else {
                int lDist = calcDist(left, n);
                int rDist = calcDist(right, n);
                
                if(lDist > rDist) {
                    right = n;
                    sb.append("R");
                } else if(lDist < rDist) {
                    left = n;
                    sb.append("L");
                } else {
                    if(hand.equals("right")) {
                        right = n;
                        sb.append("R");
                    } else if (hand.equals("left")){
                        left = n;
                        sb.append("L");
                    }
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
    
    private int calcDist(int now, int target){
        if(target == 0) target = 11;
        if(now == 0) now = 11;
        
        return (Math.abs(target - now) / 3) + (Math.abs(target - now) % 3);
    }
}