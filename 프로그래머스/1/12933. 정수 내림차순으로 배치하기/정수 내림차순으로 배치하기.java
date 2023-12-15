import java.util.*;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        while(n > 0){
            arr.add((int) (n % 10));
            n /= 10;
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int i : arr){
            sb.append(i);
        }
        return Long.parseLong(sb.toString());
    }
}