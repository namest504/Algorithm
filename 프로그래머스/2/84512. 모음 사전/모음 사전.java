import java.util.*;
class Solution {
    String[] set = new String[]{"A", "E", "I", "O", "U"};
    List<String> result = new ArrayList<>();
    int answer = 0;
    String target = "";
    
    public int solution(String word) {
        target = word;
        dfs("");
        return answer - 1;
    }
    
    private void dfs(String s){
        result.add(s);
        if(s.equals(target)){
            answer = result.size();
        }
        if(s.length() == 5){
            return;
        }
        
        for(int i = 0; i < 5; i++){
            dfs(s + set[i]);
        }
    }
}