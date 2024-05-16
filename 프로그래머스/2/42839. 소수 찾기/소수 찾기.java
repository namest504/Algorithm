import java.util.*;
class Solution {
    private Set<Integer> numSet;
    private boolean[] visit;
    
    public int solution(String numbers) {
        int answer = 0;
        
        numSet = new HashSet<>();
        visit = new boolean[numbers.length()];
        dfs(numbers, "", 0);
    
        for(int i : numSet){
            if(isPrime(i)){
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(String numbers, String s, int dept){
        if(dept >= numbers.length()) return;
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visit[i]){
                visit[i] = true;
                numSet.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), dept+1);
                visit[i] = false;
            }
        }
    }
    
    private boolean isPrime(int num){
        if(num < 2) return false;
        
        for(int i = 2; i <= (int) Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}