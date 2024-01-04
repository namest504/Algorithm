import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        HashMap<Integer, Integer> person = new HashMap<>();
        HashMap<String, Boolean> record = new HashMap<>();
        int turn = 0;
        int currentPerson;
        String prevWord = "";
        for(String word : words){
            turn++;
            currentPerson = getCurrentPerson(n, turn);
            person.put(currentPerson , person.getOrDefault(currentPerson, 0) + 1);
            
            // System.out.println(current_person + "번 째 "+ person.get(current_person) + "회 : " + word);
            if(turn > 1){
                System.out.println("이전: " + prevWord + " 현재: " + word);
                if(!isMatchLastWord(prevWord, word)){
                    System.out.println("끝말잇기 실패");
                    return new int[]{currentPerson, person.get(currentPerson)};
                }
            }
            
            if(!record.getOrDefault(word, false)){
                System.out.println("입력된 단어 " + word);
                record.put(word, true);
                prevWord = word;
            } else{
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