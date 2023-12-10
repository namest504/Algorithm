import java.util.*;

class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int pLen = phone_number.length();
        
        String lastNumber = phone_number.substring(pLen-4,pLen);
        for(int i = 0; i < pLen-4; i++){
            sb.append("*");
        }
        sb.append(lastNumber);
        return sb.toString();
    }
}