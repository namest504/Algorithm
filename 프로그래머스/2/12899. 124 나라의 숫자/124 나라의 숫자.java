import java.util.*;
class Solution {
    public String solution(int n) {
        String[] num = new String[]{"4","1","2"};
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            int r = n % 3;
            sb.append(num[r]);
            n = (n-1)/3;
        }
        return sb.reverse().toString();
    }
}