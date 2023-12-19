import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(String str : strings){
            list.add(str.charAt(n) + str);
        }
        
        Collections.sort(list);
        answer = new String[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}