import java.util.*;
class Solution {
    public int[] solution(String string) {
        List<Integer> result = new ArrayList<>();
        List<String> tuples = new ArrayList<>();
        
        // 전체 입력 첫 문자열 가공
        for(String str : string.substring(2, string.length() - 2).split("\\},\\{")) {
            tuples.add(str);
        }
        
        // 튜플 길이 순으로 정렬
        tuples.sort((s1, s2) -> s1.length() - s2.length());
        
        // 원소 포함 여부에 따라 결과에 추가
        for(String str : tuples) {
            for(String s : str.split(",")){
                Integer i = Integer.parseInt(s);
                if(!result.contains(i)){
                    result.add(i);
                }
            }
        }
        
        // List 컬렉션 Array로 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}