import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 전체의 시작일 선택
        for(int i = 0; i <= discount.length - 10; i++){
            Map<String, Integer> bought = new HashMap<>();
            boolean flag = true;
            
            // 10일간 탐색
            for(int j = i; j < i + 10; j++){
                bought.put(discount[j], bought.getOrDefault(discount[j], 0) + 1);
            }
            
            // 종료
            for(int j = 0; j < want.length; j++){
                // System.out.println("구매한 항목 = " + want[j] + " => " + bought.get(want[j]));
                if( !(bought.getOrDefault(want[j], 0) == number[j]) ){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
            
        }
        return answer;
    }
}