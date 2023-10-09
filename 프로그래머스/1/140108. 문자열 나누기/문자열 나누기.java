import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayList<String> answer = new ArrayList<>();
        
        char x;
        int left = 0;
        int right = 0;
        int count = 0;
        while(left != s.length()){
            x = s.charAt(left);
            if(right >= s.length()){
                break;
            }
            if(x != s.charAt(right)){
                if(count == 1){
                    answer.add(s.substring(left, right+1));
                    count = 0;
                    left++;
                    right++;
                    left = right;
                } else{
                    right++;
                    count--;
                }
            }else{
                count++;
                right++;
            }
        }
        
        if(left < s.length()) answer.add(s.substring(left, s.length()));
        
        
        return answer.size();
    }
}