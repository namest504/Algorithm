import java.util.*;

class Solution {
    public int[] solution(int k, int[] scores) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int[] stage = new int[k];
        int pres = Integer.MAX_VALUE;
        int day = 1;
        for(int score : scores){
            if(day <= k){
                stage[day - 1] = score;
                pres = Math.min(pres, score);
            } else{
                if(score > pres){
                    Arrays.sort(stage);
                    stage[0] = score;
                    Arrays.sort(stage);
                    pres = stage[0];
                }
            }
            arr.add(pres);
            day++;
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
}