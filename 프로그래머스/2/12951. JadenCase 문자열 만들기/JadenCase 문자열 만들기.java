import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(String str : s.split("")){
            if(str.equals(" ")){
                sb.append(" ");
                cnt = 0;
                continue;
            } 
            if(cnt++ == 0){
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }
        }
        return sb.toString();
    }
}