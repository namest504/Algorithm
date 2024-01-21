import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> tangs = new HashMap<>();
        
        for(int v : tangerine){
            tangs.put(v, tangs.getOrDefault(v , 0) + 1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>(tangs.values());
        Collections.sort(arr, Collections.reverseOrder());
        
        for(int v : arr){
            if(sum + v >= k){
                answer++;
                break;
            }
            else {
                sum += v;
                answer++;
            }
        }
        
        return answer;
    }
}