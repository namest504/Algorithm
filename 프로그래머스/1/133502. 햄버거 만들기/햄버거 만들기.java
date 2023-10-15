import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int ing : ingredient){
            arr.add(ing);
            while(arr.size() >= 4){
                int len= arr.size();
                if(arr.get(len-4) == 1 && arr.get(len-3) == 2 && arr.get(len-2) == 3 && arr.get(len-1) == 1){
                    answer++;
                    for(int i = 0; i < 4; i++){
                        arr.remove(arr.size()-1);
                    }
                }
                break;
            }
        }
        return answer;
    }
}