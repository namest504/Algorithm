import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        if(len == 1){
            return answer = new int[]{-1};
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            list.add(arr[i]);
        }

        list.remove(Collections.min(list));
        
        int size = list.size();
        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}