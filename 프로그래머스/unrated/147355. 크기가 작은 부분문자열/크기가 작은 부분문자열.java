import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pSize = p.length();
        ArrayList<Long> arr = new ArrayList<>();
        
        for(int i = 0; i <= t.length() - pSize; i++){
            arr.add(Long.parseLong(t.substring(i,i+pSize)));
        }
        
        for(Long i : arr){
            if(i <= Long.parseLong(p)) answer++;
        }
        return answer;
    }
}