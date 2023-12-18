import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        for(int i : set){
            list.add(i);
        }
        
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}