import java.util.*;

class Solution {
    static int answer = 0;
    static int resultNum;
    
    public int solution(int[] numbers, int target) {
        resultNum = target;
        dfs(numbers, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int index, int value){
        if(index == numbers.length){
            if(value == resultNum){
                answer++;
            }
        } else if(index != numbers.length){
            dfs(numbers, index+1, value + numbers[index]);
            dfs(numbers, index+1, value - numbers[index]);
        }
    }
}