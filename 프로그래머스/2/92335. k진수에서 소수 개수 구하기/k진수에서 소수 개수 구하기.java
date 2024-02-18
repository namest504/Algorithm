import java.util.*;
class Solution {
    private int answer = 0;
    
    public int solution(int n, int k) {
        String base = Integer.toString(n, k);
        check(base);
        return answer;
    }
    
    private void check(String string){
        String[] s = string.split("0");
        for(String v : s){
            if(!v.trim().isEmpty()){
                if(isPrime(v)) {
                    answer++;
                }
            }
        }
    }
    
    private boolean isPrime(String s){
        long v = Long.parseLong(s);
        if(v < 2) return false;
        for(int i = 2; i <= Math.sqrt(v); i++){
            if( v % i == 0){
                return false;
            }
        }
        return true;
    }
}