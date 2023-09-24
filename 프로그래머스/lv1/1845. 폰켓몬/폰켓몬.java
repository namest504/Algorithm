import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        HashSet<Integer> hSet = new HashSet<>();
        for(int value : nums){
            hSet.add(value);
        }
        int size = hSet.size();
        if(size > n) return n;
        else return size;
    }
}