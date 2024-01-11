import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String string : str){
            sb.append(string);
        }
        return sb.toString();
    }
}