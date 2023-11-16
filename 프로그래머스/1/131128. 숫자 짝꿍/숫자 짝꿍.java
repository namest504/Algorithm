import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        HashMap<Integer, Integer> xMap = new HashMap<>();
        for(String s : X.split("")){
            int x = Integer.parseInt(s);
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
        }
        
        HashMap<Integer, Integer> yMap = new HashMap<>();
        for(String s : Y.split("")){
            int y = Integer.parseInt(s);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 9; i >= 0; i--){
            if(xMap.get(i) != null && yMap.get(i) != null){
                int cnt = Math.min(xMap.get(i), yMap.get(i));
                for (int j = 0; j < cnt; j++) {
                    sb.append(i);
                }
            }
        }
        
        if(sb.toString().equals("")) answer = "-1";
        else if(sb.toString().startsWith("0")) answer = "0";
        else answer = sb.toString();
        return answer;
    }
}