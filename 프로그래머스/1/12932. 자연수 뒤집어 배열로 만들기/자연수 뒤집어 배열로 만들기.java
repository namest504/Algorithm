import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        while(n>0){
            arr.add((int)(n % 10));
            n /= 10;
        }
        int len = arr.size();
        answer = new int[len];
        for(int i = 0; i<len;i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}