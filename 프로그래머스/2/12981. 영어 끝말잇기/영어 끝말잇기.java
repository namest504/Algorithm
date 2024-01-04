import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<Integer, Integer> person = new HashMap<>(); // 참여자의 차례가 몇 번째 인지 기록
        HashMap<String, Boolean> record = new HashMap<>(); // 끝말잇기에 사용된 단어 기록
        
        int turn = 0; // 끝말잇기 진행 턴 기록
        int currentPerson; // 현재 참여자의 번호를 계산하고 저장할 변수
        String prevWord = ""; // 이전 끝말잇기 단어 저장할 변수
        
        for(String word : words){
            turn++;
            currentPerson = getCurrentPerson(n, turn);
            person.put(currentPerson , person.getOrDefault(currentPerson, 0) + 1);
            
            // 첫 번째 턴이 아니라면 이전 단어의 끝과 현재 단어의 시작을 비교
            if(turn > 1){
                if(!isMatchLastWord(prevWord, word)){
                    return new int[]{currentPerson, person.get(currentPerson)};
                }
            }
            
            // record에 단어가 없다면 record에 저장하고 prevWord에 단어 저장
            if(!record.getOrDefault(word, false)){
                record.put(word, true);
                prevWord = word;
            } else{ // 만약 record에 단어가 존재한다면 종료
                return new int[]{ currentPerson, person.get(currentPerson)};
            }
        }

        return new int[]{0, 0};
    }
    
    private int getCurrentPerson(int n, int turn){
        return turn%n == 0 ? n : turn%n;
    }
    
    private boolean isMatchLastWord(String before, String after){
         System.out.println(before.split("")[before.length() - 1] + "과 " + after.split("")[0] + "비교");
        return before.split("")[before.length() - 1].equals(after.split("")[0]);
    }
}