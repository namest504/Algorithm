import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> spareSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();
        
        for(int s : reserve){
            spareSet.add(s);
        }
        
        for(int l : lost){
            if(spareSet.contains(l)){
                spareSet.remove(l);
            } else {
                lostSet.add(l);
            }
        }
        
        for(int l : spareSet){
            if(lostSet.contains(l-1)){
                lostSet.remove(l-1);
            } else if(lostSet.contains(l+1)){
                lostSet.remove(l+1);
            }
        }
        
        return n - lostSet.size();
    }
}