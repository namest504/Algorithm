import java.util.*;

class Solution {
    public boolean solution(String s) {
        int cnt = 0;
        for(Character c : s.toCharArray()){
            if(c == '('){
              cnt++; 
            } else if (c == ')'){
                if(cnt != 0){
                    cnt--;
                }else{
                    return false;
                }
            }
        }
        if(cnt != 0) return false;
        return true;
    }
}