import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            arr.add(divisorCount(i));
        }
        for(Integer i : arr){
            if(i > limit) answer += power;
            else answer += i;
        }
        return answer;
    }
    
    private int divisorCount(int num){
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
	        if (i * i == num) count++;
	        else if (num % i == 0) count += 2;
        }
        return count;
    }
}