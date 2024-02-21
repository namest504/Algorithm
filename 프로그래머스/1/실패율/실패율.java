import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int usersCount = stages.length;
        
        // 스테이지 별 도달하여 클리어 한 인원 수
        Map<Integer, Integer> clear = new HashMap<>();
        // 스테이지 별 도달하여 도전중인 인원 수
        Map<Integer, Integer> chall = new HashMap<>();
        // 스테이지 별 실패율 값
        Map<Integer, Double> fail = new HashMap<>();        
        
        // 스테이지 도전중, 클리어 인원 수 저장
        for(int i = 0; i < usersCount; i++){
            for(int j = 1; j <= stages[i]; j++){
                clear.put(j, clear.getOrDefault(j, 0) + 1);
            }
            chall.put(stages[i], chall.getOrDefault(stages[i], 0) + 1);
        }
        
        // 실패율 저장
        double value = 0;
        int top = 0;
        int bottom = 0;
        for(int i = 0; i < N; i++){
            top = chall.getOrDefault(i+1, 0);
            bottom = clear.getOrDefault(i+1, 0);
            if(top == 0 || bottom == 0){
                value = 0;
            } else {
                value = (double) top / (double) bottom;
            }
            fail.put(i+1, value);
        }
        
        //순서를 저장할 배열
        List<Integer> result = new ArrayList<>(fail.keySet());
        
        //정렬
        result.sort((o1, o2) -> Double.compare(fail.get(o2), fail.get(o1)));

        int[] answer = new int[N];
        
        for(int i = 0; i < N; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}