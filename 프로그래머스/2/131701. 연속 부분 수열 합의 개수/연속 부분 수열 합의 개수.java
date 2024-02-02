import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        // 길이
        for(int i = 1; i <= elements.length; i++){
            // 시작 위치
            for(int j = 0; j < elements.length; j++){
                int sum = 0;
                // 종료 위치
                for(int k = j; k < j + i; k++){
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}